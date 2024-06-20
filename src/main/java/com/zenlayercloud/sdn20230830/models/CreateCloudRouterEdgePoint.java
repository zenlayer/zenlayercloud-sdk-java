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
     * 公有云区域ID。
     */
    public String cloudRegionId;

    /**
     * 连接点名称, 仅支持类型为云连接时指定名称。<br/>
     * 如果是端口, 则会使用端口名作为接入点名称。<br/>
     * 如果是VPC, 则会使用VPC名作为接入点名称。
     */
    public String edgePointName;

    /**
     * 公有云账号ID。Google 云此处为 pairing key。
     */
    public String cloudAccountId;

    /**
     * 接入点数据中心ID。
     */
    public String dcId;

    /**
     * 云连接类型。可选值：
     * - AWS
     * - TENCENT
     * - GOOGLE
     * - ALI_CLOUD
     * - AZURE
     */
    public String cloudType;

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

    /**
     * 高可用类型
     */
    public String haType;
}
