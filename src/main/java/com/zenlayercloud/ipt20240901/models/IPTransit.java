/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.sdn20230830.models.DatacenterInfo;

import java.util.Date;
import java.util.List;

/**
 * @author wolfgang.zhu
 * @date 2024-08-08 14:13:06
 * @version $ Id: IPTransit.java, v 0.1  wolfgang.zhu Exp $
 */
public class IPTransit extends TeaModel {
    /**
     * IP Transit ID。
     */
    public  String          iptId;
    /**
     * IP Transit 名称。
     */
    public  String          iptName;
    /**
     * IP Transit 描述信息。
     */
    public  String          iptDescription;
    /**
     * IP Transit 对应的数据中心。
     */
    public  DatacenterInfo  dataCenter;
    /**
     * 连接的端口ID。
     */
    public  String          peerPortId;
    /**
     * 连接的端口名称。
     */
    public  String          peerPortName;
    /**
     * vlan ID。
     */
    private Integer         peerPortVlan;
    /**
     * 端口侧所属数据中心。
     */
    public  DatacenterInfo  peerDataCenter;
    /**
     * 交付类型。
     * - Manual: 手动交付。（一般在3天内交付完成）
     * - Auto: 自动划交付。（一般在分钟内完成）
     */
    public  String          deliveryType;
    /**
     * IP Transit 所属资源组ID。
     */
    public  String          resourceGroupId;
    /**
     * IP Transit 所属资源组名称。
     */
    public  String          resourceGroupName;
    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public  String          createTime;
    /**
     * 路由类型。
     * - Static 静态路由
     * - Gateway 网关模式
     * - BGP
     */
    public  String          routingType;
    /**
     * 带宽计费方式。
     * - ByBandwidth: 按固定带宽计费
     * - ByInstanceBandwidth95: 实例95计费
     */
    public  String          internetType;
    /**
     * 带宽限速。
     * 单位Mbps。
     */
    public  Integer         bandwidth;
    /**
     * 承诺保底带宽。
     * 仅当带宽计费方式为ByInstanceBandwidth95 可取到值。
     */
    public  Integer         commitBandwidth;
    /**
     * BFD 配置。
     */
    public  BFDConfig       bfd;
    /**
     * 互联IP地址信息。
     */
    public  Interconnect    interconnect;
    /**
     * IP Transit 互联的专线ID。
     */
    public  String          privateConnectId;
    /**
     * IP Transit 互联的专线名称。
     */
    public  String          privateConnectName;
    /**
     * 公网IP信息。
     */
    public  List<IPAddress> publicIpv4Addresses;
    /**
     * IP Transit 的业务状态。
     */
    public  String          iptStatus;

}
