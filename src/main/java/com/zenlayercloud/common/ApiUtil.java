/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

import com.aliyun.tea.TeaException;
import com.aliyun.tea.TeaRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import static com.zenlayercloud.common.Config.REQ_POST;

/**
 * @author wolfgang
 * @date 2022-11-23 22:03:53
 * @version $ Id: ApiUtil.java, v 0.1  wolfgang Exp $
 */
public class ApiUtil {

    public static String getCanonicalQueryString(Map<String, String> params, String method) {
        if (method != null && method.equals(REQ_POST)) {
            return "";
        }
        StringBuilder queryString = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String v;
            try {
                v = URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new TeaException("UTF8 is not supported.", e);
            }
            queryString.append("&").append(entry.getKey()).append("=").append(v);
        }
        if (queryString.length() == 0) {
            return "";
        } else {
            return queryString.substring(1);
        }
    }

    public static String sha256Hex(String bodyString) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new TeaException("SHA-256 is not supported.", e);
        }
        byte[] d = md.digest(bodyString.getBytes(StandardCharsets.UTF_8));
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    public static String getAuthorization(TeaRequest request, String endpoint, String signatureAlgorithm, String bodyString,
                                          String accessKeyId, String accessKeyPassword) {
        String method = request.method;
        String canonicalUri = "/";
        Map<String, String> headers = request.headers;
        Map<String, String> query = request.query;
        String contentType = headers.get("content-type") == null ? "" : headers.get("content-type");
        String canonicalQueryString = getCanonicalQueryString(query, method);
        String hashedRequestPayload = ApiUtil.sha256Hex(bodyString);
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String canonicalRequest = method + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n" + canonicalHeaders + "\n"
                + signedHeaders + "\n" + hashedRequestPayload;
        String hashedCanonicalRequest = ApiUtil.sha256Hex(canonicalRequest);

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        request.headers.put("x-zc-timestamp", timestamp);

        String stringToSign = signatureAlgorithm + "\n" + timestamp + "\n" + hashedCanonicalRequest;
        String signature = DatatypeConverter.printHexBinary(hmac256(accessKeyPassword.getBytes(StandardCharsets.UTF_8), stringToSign))
                .toLowerCase();
        String authorization = signatureAlgorithm + " " + "Credential=" + accessKeyId + ", " + "SignedHeaders=" + signedHeaders + ", "
                + "Signature=" + signature;
        return authorization;
    }

    public static byte[] hmac256(byte[] key, String msg) {
        Mac mac;
        try {
            mac = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new TeaException("HmacSHA256 is not supported.", e);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        try {
            mac.init(secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new TeaException(e.getClass().getName() + "-" + e.getMessage(), e);
        }
        return mac.doFinal(msg.getBytes(StandardCharsets.UTF_8));
    }

}
