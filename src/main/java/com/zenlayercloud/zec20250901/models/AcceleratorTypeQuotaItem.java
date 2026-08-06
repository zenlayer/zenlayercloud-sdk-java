package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述加速卡规格在某可用区的售卖信息。
 */
public class AcceleratorTypeQuotaItem extends TeaModel {


    /**
     * 可用区 ID。
     */
    public String zoneId;

    /**
     * 加速卡规格 ID。
     * 例如：z2a.v.T1U.c16m64.1。
     * 创建实例时将此值传入 CreateZecInstances 的 instanceType 参数。
     */
    public String instanceType;

    /**
     * 加速卡类型。
     * 取值范围：VPU。
     * 未来可能扩展 TPU/NPU/LPU 等。
     */
    public String acceleratorType;

    /**
     * CPU 核数。
     * 单位：核。
     */
    public Integer cpuCount;

    /**
     * 内存容量。
     * 单位：GiB。
     */
    public Integer memory;

    /**
     * 加速卡卡数。
     */
    public Integer acceleratorAmount;

    /**
     * 加速卡规格描述。
     */
    public String instanceTypeName;

    /**
     * 单张网卡的带宽上限。
     * 单位：比特/秒。
     */
    public Long bps;

    /**
     * 单张网卡的收发包上限。
     * 单位：个/秒。
     */
    public Long pps;

    /**
     * 加速卡系列库存档位。
     */
    public String inventoryCapacity;

    /**
     * 该规格的价格。
     */
    public PriceItem price;

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

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
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

    public Integer getAcceleratorAmount() {
        return this.acceleratorAmount;
    }

    public void setAcceleratorAmount(Integer acceleratorAmount) {
        this.acceleratorAmount = acceleratorAmount;
    }

    public String getInstanceTypeName() {
        return this.instanceTypeName;
    }

    public void setInstanceTypeName(String instanceTypeName) {
        this.instanceTypeName = instanceTypeName;
    }

    public Long getBps() {
        return this.bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public Long getPps() {
        return this.pps;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public String getInventoryCapacity() {
        return this.inventoryCapacity;
    }

    public void setInventoryCapacity(String inventoryCapacity) {
        this.inventoryCapacity = inventoryCapacity;
    }

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

}