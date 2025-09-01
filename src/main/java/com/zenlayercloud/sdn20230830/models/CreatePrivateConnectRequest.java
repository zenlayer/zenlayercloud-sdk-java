/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 11:41:08
 * @version $ Id: CreatePrivateConnectRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreatePrivateConnectRequest extends TeaModel {

    /**
     * 二层网络专线的名称。
     * 长度不能超过255。
     * 默认为private-connect-{当前时间戳}
     */
    public String privateConnectName;

    /**
     * 创建二层网络其中一端的连接点（A）
     */
    public CreateEndpointParam endpointA;

    /**
     * 创建二层网络另一端的连接点（Z）
     */
    public CreateEndpointParam endpointZ;

    /**
     * 二层网络专线最大带宽。
     * 范围是1～500。
     * 默认值是1 ，单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * 资源组的ID。
     * 如果不传，则会放到默认资源组。
     */
    public String resourceGroupId;

    public MarketingInfo marketingOptions;
}
