/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:59:19
 * @version $ Id: ModifyPrivateConnectBandwidthRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyPrivateConnectBandwidthRequest extends TeaModel {

    /**
     * 二层网络专线ID。
     */
    public String privateConnectId;

    /**
     * 需要修改的带宽限速。
     * 大小在1-500。单位：Mbps。
     */
    public Integer bandwidthMbps;
}
