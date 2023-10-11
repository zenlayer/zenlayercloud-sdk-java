/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2023-10-07 17:28:44
 * @version $ Id: ListKeyPairResponse.java, v 0.1  wolfgang Exp $
 */
public class KeyPair extends TeaModel {
    public String keyId;
    public String keyName;
    public String keyDescription;
    public String publicKey;
    public String fingerprint;
    public String createTime;
}
