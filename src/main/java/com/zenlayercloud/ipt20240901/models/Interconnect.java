/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

public class Interconnect extends TeaModel {
    /**
     * 运营商侧的IPv4地址。
     */
    public String vendorIpv4Address;
    /**
     * 用户侧的IPv4地址。
     */
    public String customerIpv4Address;
}