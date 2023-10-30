/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-19 16:29:20
 * @version $ Id: ModifyCloudRouterEdgePointRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyCloudRouterEdgePointRequest extends TeaModel {

    /**
     * 三层网络连接点的ID。
     */
    public String edgePointId;

    /**
     * 连接点关联的三层网络ID。
     */
    public String cloudRouterId;

    /**
     * BGP连接配置信息。
     */
    public BGPConnection bgpConnection;

    /**
     * 静态路由配置信息。
     */
    public List<IPRoute> staticRoutes;

    /**
     * 需要修改的带宽限速。
     */
    public Integer bandwidthMbps;

    /**
     * IP地址信息。
     */
    public String ipAddress;
}
