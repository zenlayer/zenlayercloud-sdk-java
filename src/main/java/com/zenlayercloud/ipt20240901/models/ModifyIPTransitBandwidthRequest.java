/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2023-07-18 20:55:28
 * @version $ Id: ModifyPrivateConnectBandwidthRequest.java, v 0.1  wolfgang Exp $
 */
public class ModifyIPTransitBandwidthRequest extends TeaModel {
    /**
     * IP Transit ID。
     */
    public String  iptId;
    /**
     * 需要修改的带宽限速。
     * 范围：1~1000。
     * 单位：Mbps。
     */
    public Integer bandwidth;
    /**
     * 保底带宽。
     * 当IP Transit的带宽计费方式为95计费时该参数有效，如果不设置，则不会修改保底。
     */
    public Integer commitBandwidth;
}
