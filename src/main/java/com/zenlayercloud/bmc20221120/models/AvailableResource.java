/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-15 23:22:37
 * @version $ Id: AvailableResource.java, v 0.1  wolfgang Exp $
 */
public class AvailableResource extends TeaModel {
    /**
     * 可用区ID。
     */
    public String       zoneId;
    /**
     * 售卖的状态。
     * SELL：表示实例可购买，且库存>10。
     * SELL_SHORTAGE: 表示可购买，但是库存<10台。
     * SOLD_OUT：表示实例已售罄。
     */
    public String       sellStatus;
    /**
     * 公网计费类型。
     * 取值范围：
     * ByBandwidth：按固定带宽计费。
     * ByTrafficPackage: 购买流量包计费。
     * ByInstanceBandwidth95: 单个实例95计费
     * ByClusterBandwidth95: 合并95计费。
     */
    public List<String> internetChargeTypes;
    /**
     * 机型ID。
     */
    public String       instanceTypeId;
    /**
     * 最大的公网出口带宽限制。
     * 单位：Mbps。
     */
    public Integer      maximumBandwidthOut;
    /**
     * 固定带宽计费方式时默认赠送公网带宽。
     * 单位：GB。
     */
    public Integer      defaultBandwidthOut;
    /**
     * 流量包计费方式时默认增送的流量包大小。
     * 单位：TB。
     */
    public Double       defaultTrafficPackageSize;
    /**
     * 库存数量。
     */
    public Integer      qty;
}
