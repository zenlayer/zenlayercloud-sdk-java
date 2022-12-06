/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * @author wolfgang
 * @date 2022-11-09 20:17:57
 * @version $ Id: Credential.java, v 0.1  wolfgang Exp $
 */
public class Credential {

    private String accessKeyId;
    private String accessKeyPassword;

    public Credential(String accessKeyId, String accessKeyPassword) {
        if (accessKeyId == null) {
            throw new IllegalArgumentException("Access key ID cannot be null.");
        } else if (accessKeyPassword == null) {
            throw new IllegalArgumentException("Access key password cannot be null.");
        } else {
            this.accessKeyId = accessKeyId;
            this.accessKeyPassword = accessKeyPassword;
        }
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeyPassword() {
        return accessKeyPassword;
    }

    public void setAccessKeyPassword(String accessKeyPassword) {
        this.accessKeyPassword = accessKeyPassword;
    }
}
