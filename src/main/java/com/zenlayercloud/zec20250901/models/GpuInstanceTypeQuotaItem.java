package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述GPU规格在某可用区的售卖信息。
 */
public class GpuInstanceTypeQuotaItem extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * GPU规格ID。
     * 例如：z3a.g.C49.c8m32.1。
     * 变更规格时将此值传入 ~~ModifyInstanceType~~ 的instanceType参数。
     */
    public String instanceType;

    /**
     * CPU核数。
     * 单位：核。
     */
    public Integer cpuCount;

    /**
     * 内存容量。
     * 单位：GiB。
     */
    public Integer memory;

    /**
     * GPU卡数。
     */
    public Integer gpuAmount;

    /**
     * GPU规格描述。
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
     * GPU系列库存档位。
     * 表示该GPU系列在对应可用区所在区域的库存量级：`LIMITED`（小于1000）、`NORMAL`（1000–2000）、`SUFFICIENT`（2000–5000）、`ABUNDANT`（不小于5000）。
     * GPU实例数量远低于上述阈值，实际可用时通常为`LIMITED`。
     */
    public String inventoryCapacity;

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

    public Integer getGpuAmount() {
        return this.gpuAmount;
    }

    public void setGpuAmount(Integer gpuAmount) {
        this.gpuAmount = gpuAmount;
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

}