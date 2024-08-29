/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang.zhu
 * @date 2024-08-08 14:16:52
 * @version $ Id: IPAddress.java, v 0.1  wolfgang.zhu Exp $
 */
public class IPAddress extends TeaModel {
    /**
     * IP地址
     */
    public String  ipAddress;
    /**
     * 掩码。
     */
    public Integer netmask;
    /**
     * 网关IP地址。
     */
    public String  gatewayIpAddress;
}
