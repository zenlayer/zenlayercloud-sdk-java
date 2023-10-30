/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:33:43
 * @version $ Id: CreateCloudRouterEdgePoint.java, v 0.1  alicat.xu Exp $
 */
public class CreateCloudRouterEdgePoint extends TeaModel {

    /**
     * 裸金属产品内VPC ID。
     */
    public String vpcId;

    /**
     * 接入的带宽大小。
     */
    public Integer bandwidthMbps;

    /**
     * 物理端口ID。
     */
    public String portId;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * IP地址信息。
     */
    public String ipAddress;

    /**
     * BGP连接配置信息。
     */
    public BGPConnection bgpConnection;

    /**
     * 静态路由配置信息。
     */
    public List<IPRoute> staticRoutes;
}
