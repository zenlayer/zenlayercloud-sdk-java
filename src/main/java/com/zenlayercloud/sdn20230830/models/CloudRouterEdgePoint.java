/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-09 17:53:41
 * @version $ Id: CloudRouterEdgePoint.java, v 0.1  alicat.xu Exp $
 */
public class CloudRouterEdgePoint extends TeaModel {

    /**
     * 边缘连接点的ID。
     */
    public String edgePointId;

    /**
     * 边缘连接点的名称。
     */
    public String edgePointName;

    /**
     * 边缘连接点的状态。
     */
    public String connectivityStatus;

    /**
     * 边缘连接点所在的数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * IP地址。
     */
    public String ipAddress;

    /**
     * 边缘连接点的类型。
     */
    public String edgePointType;

    /**
     * VPC边缘连接点的ID.
     */
    public String vpcId;

    /**
     * 物理端口的ID.
     */
    public String portId;

    /**
     * 边缘连接点配置的VLAN ID。
     */
    public Integer vlanId;

    /**
     * 带宽大小。
     */
    public Integer bandwidthMbps;

    /**
     * BGP连接配置信息。
     */
    public BGPConnection bgpConnection;

    /**
     * 静态路由配置信息
     */
    public List<IPRoute> staticRoutes;

    /**
     * 创建时间。
     */
    public String createTime;

}
