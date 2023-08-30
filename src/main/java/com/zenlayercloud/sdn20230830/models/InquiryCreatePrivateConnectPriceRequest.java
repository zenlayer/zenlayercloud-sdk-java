/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:42:31
 * @version $ Id: InquiryCreatePrivateConnectPriceRequest.java, v 0.1  alicat.xu Exp $
 */
public class InquiryCreatePrivateConnectPriceRequest extends TeaModel {

    /**
     * 创建二层网络其中一端的连接点（A）
     */
    public CreateEndpointParam endpointA;

    /**
     * 创建二层网络另一端的连接点（Z）
     */
    public CreateEndpointParam endpointZ;

    /**
     * 二层网络专线的最大带宽限制。
     * 默认值是1，单位：Mbps。
     */
    public Integer bandwidthMbps;
}
