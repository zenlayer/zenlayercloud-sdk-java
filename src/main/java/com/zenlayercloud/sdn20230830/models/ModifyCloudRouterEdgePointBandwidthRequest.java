/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:51:49
 * @version $ Id: ModifyCloudRouterEdgePointBandwidthRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyCloudRouterEdgePointBandwidthRequest extends TeaModel {

    /**
     * 三层网络连接点的ID。
     */
    public String edgePointId;

    /**
     * 连接点关联的三层网络ID。
     */
    public String cloudRouterId;

    /**
     * 需要修改的带宽限速。
     */
    public Integer bandwidthMbps;
}
