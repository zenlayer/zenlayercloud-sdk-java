/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * @author wolfgang
 * @date 2023-01-08 14:10:35
 * @version $ Id: ZenlayerSdkException.java, v 0.1  wolfgang Exp $
 */
public class ZenlayerSdkException extends RuntimeException {
    private String requestId;
    private String message;
    private String code;

    public ZenlayerSdkException(Throwable cause) {
        super(cause);
        this.message = cause.getMessage();
    }

    public ZenlayerSdkException(String message) {
        super(message);
        this.message = message;
        this.requestId = "";
        this.code = "";
    }

    public ZenlayerSdkException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public ZenlayerSdkException(Throwable cause, String requestId, String message, String code) {
        super(message, cause);
        this.requestId = requestId;
        this.message = message;
        this.code = code;
    }

    public ZenlayerSdkException(String requestId, String message, String code) {
        this.requestId = requestId;
        this.message = message;
        this.code = code;
    }

    public ZenlayerSdkException(String message, String code) {
        this.requestId = "";
        this.message = message;
        this.code = code;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
