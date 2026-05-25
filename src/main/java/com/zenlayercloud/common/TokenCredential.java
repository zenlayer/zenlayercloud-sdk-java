/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * Bearer token credential for Zenlayer Cloud APIs.
 *
 * <p>Generate a personal access token from the Zenlayer Cloud console (Keys &gt; Tokens)
 * and use it to authenticate without HMAC request signing.</p>
 *
 * <pre>{@code
 * TokenCredential credential = new TokenCredential("your-access-token");
 * BmcClient client = new BmcClient(credential);
 * }</pre>
 */
public class TokenCredential implements CredentialIface {

    private final String token;

    public TokenCredential(String token) {
        if (token == null || token.trim().isEmpty()) {
            throw new IllegalArgumentException("Token cannot be null or empty.");
        }
        this.token = token.trim();
    }

    @Override
    public String getAccessKeyId() {
        return "";
    }

    @Override
    public String getAccessKeyPassword() {
        return "";
    }

    @Override
    public String getToken() {
        return token;
    }
}
