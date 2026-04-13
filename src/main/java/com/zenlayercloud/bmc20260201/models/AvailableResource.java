package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 可售卖的实例资源信息。描述了哪些可用区有哪些机型可以售卖。
 */
public class AvailableResource extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 售卖的状态。
     * <ul><li>SELL：表示实例可购买，且库存>10。</li><li>SELL_SHORTAGE: 表示可购买，但是库存<10台。</li><li>SOLD_OUT：表示实例已售罄。</li></ul>
     */
    public String sellStatus;

    /**
     * 网络计费类型。
     */
    public List<String> internetChargeTypes;

    /**
     * 机型ID。
     */
    public String instanceTypeId;

    /**
     * 最大的公网出口带宽限制。
     * 单位：Mbps。
     */
    public Integer maximumBandwidthOut;

    /**
     * 固定带宽计费方式时默认赠送公网带宽。
     * 单位：GB。
     */
    public Integer defaultBandwidthOut;

    /**
     * 流量包计费方式时默认增送的流量包大小。
     * 单位：TB。
     */
    public Double defaultTrafficPackageSize;

    /**
     * 库存数量。
     */
    public Integer qty;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getSellStatus() {
        return this.sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    public List<String> getInternetChargeTypes() {
        return this.internetChargeTypes;
    }

    public void setInternetChargeTypes(List<String> internetChargeTypes) {
        this.internetChargeTypes = internetChargeTypes;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public Integer getMaximumBandwidthOut() {
        return this.maximumBandwidthOut;
    }

    public void setMaximumBandwidthOut(Integer maximumBandwidthOut) {
        this.maximumBandwidthOut = maximumBandwidthOut;
    }

    public Integer getDefaultBandwidthOut() {
        return this.defaultBandwidthOut;
    }

    public void setDefaultBandwidthOut(Integer defaultBandwidthOut) {
        this.defaultBandwidthOut = defaultBandwidthOut;
    }

    public Double getDefaultTrafficPackageSize() {
        return this.defaultTrafficPackageSize;
    }

    public void setDefaultTrafficPackageSize(Double defaultTrafficPackageSize) {
        this.defaultTrafficPackageSize = defaultTrafficPackageSize;
    }

    public Integer getQty() {
        return this.qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

}