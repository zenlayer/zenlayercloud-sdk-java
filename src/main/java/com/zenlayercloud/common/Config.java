/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

import com.aliyun.tea.NameInMap;

/**
 * @author wolfgang
 * @version $ Id: Config.java, v 0.1  wolfgang Exp $
 * @date 2022-12-05 15:54:40
 */
public class Config  {
    public static final String REQ_HTTPS = "https";


    public static final String REQ_POST = "POST";


    public static final String REQ_SIGNATURE_ALGORITHM = "ZC2-HMAC-SHA256";
    public static final String REQ_SIGNATURE_VERSION = "V2";



    // http protocol
    @NameInMap("protocol")
    public String protocol;

    // http method
    @NameInMap("method")
    public String method;

    // read timeout
    @NameInMap("readTimeout")
    public Integer readTimeout;

    // connect timeout
    @NameInMap("connectTimeout")
    public Integer connectTimeout;

    // http proxy
    @NameInMap("httpProxy")
    public String httpProxy;

    // https proxy
    @NameInMap("httpsProxy")
    public String httpsProxy;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("noProxy")
    public String noProxy;

    @NameInMap("maxIdleConns")
    public Integer maxIdleConns;

    @NameInMap("userAgent")
    public String userAgent;

    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    @NameInMap("signatureVersion")
    public String signatureVersion;

    @NameInMap("signatureAlgorithm")
    public String signatureAlgorithm;

    @NameInMap("requestClient")
    public String requestClient;

    public Config() {
        this.method = REQ_POST;
        this.protocol = REQ_HTTPS;
        this.endpoint = null;
        this.signatureAlgorithm = REQ_SIGNATURE_ALGORITHM;
        this.signatureVersion = REQ_SIGNATURE_VERSION;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public String getHttpsProxy() {
        return httpsProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getNoProxy() {
        return noProxy;
    }

    public void setNoProxy(String noProxy) {
        this.noProxy = noProxy;
    }

    public Integer getMaxIdleConns() {
        return maxIdleConns;
    }

    public void setMaxIdleConns(Integer maxIdleConns) {
        this.maxIdleConns = maxIdleConns;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getSocks5Proxy() {
        return socks5Proxy;
    }

    public void setSocks5Proxy(String socks5Proxy) {
        this.socks5Proxy = socks5Proxy;
    }

    public String getSocks5NetWork() {
        return socks5NetWork;
    }

    public void setSocks5NetWork(String socks5NetWork) {
        this.socks5NetWork = socks5NetWork;
    }

    public String getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }
}
