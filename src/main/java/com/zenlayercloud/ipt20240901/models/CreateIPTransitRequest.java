/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-07-18 20:55:28
 * @version $ Id: ModifyPrivateConnectBandwidthRequest.java, v 0.1  wolfgang Exp $
 */
public class CreateIPTransitRequest extends TeaModel {
    /**
     * IP Transit的名称。
     * 长度不能超过255。
     */
    public String        iptName;
    /**
     * IP Transit的描述信息。
     * 长度不能超过255。
     */
    public String        iptDescription;
    /**
     * 端口的ID。
     * 端口的连通性状态必须是ACTIVE
     */
    public String        peerPortId;
    /**
     * VLAN ID。
     * 范围为1000～4000。
     * 必须为未分配的vlan, 可以通过DescribePortUsableVlan来查询一个可以使用的vlan。
     */
    public Integer       peerPortVlan;
    /**
     * IP Transit 目的地数据中心ID。
     * 如果不指定，则代表和端口位于同一个数据中心
     */
    public String        iptDcId;
    /**
     * IP Transit的带宽计费方式。
     */
    public String        internetType;
    /**
     * 保底带宽。
     * 单位Mbps。
     * 有且仅当internetType=ByInstanceBandwidth95时该字段必传。
     */
    public Integer       commitBandwidth;
    /**
     * 带宽限速。
     * 单位Mbps
     * 最小值不能低于10Mbps。
     */
    public Integer       bandwidth;
    /**
     * 路由类型。
     * - Static 静态路由
     * - Gateway 网关模式
     * - BGP
     */
    public String        routingType;
    /**
     * 公网IPv4地址。
     * 网段范围：24～30
     * 有且仅当路由类型是Static 或 Gateway时必须指定。
     * 目前只允许指定一个公网CIDR。
     */
    public List<Integer> publicIPv4BlockSize;
    /**
     * 启用 BFD配置。
     * 如果不传该字段，则默认不启用BFD。
     */
    public BFDConfig     bfd;
    /**
     * 资源组的ID。
     * 如果不传，则会放到默认资源组。
     */
    public String        resourceGroupId;
}
