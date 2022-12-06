/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * @author wolfgang
 * @version $ Id: ZenlayerSdkException.java, v 0.1  wolfgang Exp $
 * @date 2022-12-05 23:16:37
 */
public class ZenlayerSdkException extends Exception{

    private String requestId;
    private String code;
    private String message;

    public ZenlayerSdkException(String message) {
        super(message);
    }
}
