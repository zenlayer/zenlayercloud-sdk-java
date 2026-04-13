package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述可用区的机型配置信息。
 */
public class InstanceTypeQuotaItem extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 实例机型。
     */
    public String instanceType;

    /**
     * 实例机型名称。
     */
    public String instanceTypeName;

    /**
     * CPU核数。
     */
    public Integer cpuCount;

    /**
     * 内存大小，单位GiB。
     */
    public Integer memory;

    /**
     * 公网出口带宽上限。
     */
    public Integer internetMaxBandwidthOutLimit;

    /**
     * CPU主频。
     */
    public String frequency;

    /**
     * 支持的网络计费类型列表。
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

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<String> getInternetChargeTypes() {
        return this.internetChargeTypes;
    }

    public void setInternetChargeTypes(List<String> internetChargeTypes) {
        this.internetChargeTypes = internetChargeTypes;
    }

}