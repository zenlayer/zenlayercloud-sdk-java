/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @version $ Id: DescribeGoogleVlanUsageRequest.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:57:11
 */
public class DescribeAzureVlanUsageRequest extends TeaModel {

    /**
     * 接入点的数据中心ID。
     */
    public String dcId;

    /**
     * Azure 配对密钥。
     */
    public String pairingKey;


}
