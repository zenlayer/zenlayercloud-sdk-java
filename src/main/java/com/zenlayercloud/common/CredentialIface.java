/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * Common interface for all credential types.
 * Implementations: {@link Credential} (HMAC-SHA256 signing), {@link TokenCredential} (Bearer token).
 */
public interface CredentialIface {

    String getAccessKeyId();

    String getAccessKeyPassword();

    /**
     * Returns the Bearer token for token-based authentication, or null/empty for HMAC-based authentication.
     */
    String getToken();
}
