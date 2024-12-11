/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2023-10-07 17:28:44
 * @version $ Id: ListKeyPairResponse.java, v 0.1  wolfgang Exp $
 */
public class KeyPair extends TeaModel {
    public String keyId;
    public String keyName;
    public String publicKey;
    public String keyDescription;
    public String createTime;
}
