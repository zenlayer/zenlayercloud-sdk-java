/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2023-09-12 20:43:13
 * @version $ Id: ImportKeyPairRequest.java, v 0.1  wolfgang Exp $
 */
public class ImportKeyPairRequest extends TeaModel {
    public String keyName;
    public String keyDescription;
    public String publicKey;
}
