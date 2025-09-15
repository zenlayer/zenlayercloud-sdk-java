package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述实例规格的售卖信息。
 */
public class InstanceTypeQuotaItem extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 实例规格ID
     */
    public String instanceType;

    /**
     * 实例规格的名称
     */
    public String instanceTypeName;

    /**
     * CPU核数。
     * 单位：核
     */
    public Integer cpuCount;

    /**
     * 实例内存容量。
     * 单位：GiB
     */
    public Integer memory;

    /**
     * 最大出口带宽限制
     */
    public Integer internetMaxBandwidthOutLimit;

    /**
     * 是否有库存
     */
    public Boolean withStock;

    /**
     * 支持的网络计费类型
     */
    public List<String> internetChargeTypes;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceTypeName() {
        return this.instanceTypeName;
    }

    public void setInstanceTypeName(String instanceTypeName) {
        this.instanceTypeName = instanceTypeName;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    public Integer getMemory() {
        return this.memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getInternetMaxBandwidthOutLimit() {
        return this.internetMaxBandwidthOutLimit;
    }

    public void setInternetMaxBandwidthOutLimit(Integer internetMaxBandwidthOutLimit) {
        this.internetMaxBandwidthOutLimit = internetMaxBandwidthOutLimit;
    }

    public Boolean getWithStock() {
        return this.withStock;
    }

    public void setWithStock(Boolean withStock) {
        this.withStock = withStock;
    }

    public List<String> getInternetChargeTypes() {
        return this.internetChargeTypes;
    }

    public void setInternetChargeTypes(List<String> internetChargeTypes) {
        this.internetChargeTypes = internetChargeTypes;
    }

}