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
     * 弹性算力产品内边界网关 ID。
     */
    public String zbgId;

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

    /**
     * IPSec隧道。可选值：
     * FQDN
     * RemoteIP
     */
    public String ipSecTunnel;

    /**
     * 预共享密钥。
     */
    public String psk;

    /**
     * 您的公网IP地址。
     * 当 ipSecTunnel 为 RemoteIP 时必传。
     */
    public String customerPublicIP;

    /**
     * 您的内网IP地址。
     */
    public String customerPrivateIP;

    /**
     * 边缘网关内网IP地址。
     */
    public String virtualEdgePrivateIP;

    /**
     * 是否启用健康检查。
     * 默认值为 false 不开启。
     */
    public Boolean enableHealthCheck;

    /**
     * BGP连接配置信息。
     * BGP和静态路由配置二者二选其一。
     */
    public IPSecBGPConnection ipSecBgpConnection;

    /**
     * 静态路由配置信息。
     * BGP和静态路由配置二者二选其一。
     */
    public List<IPSecStaticRoute> ipSecStaticRoutes;

    /**
     * 备用IPSec配置。
     */
    public BackupIPSecConfig backupIpSec;
}
