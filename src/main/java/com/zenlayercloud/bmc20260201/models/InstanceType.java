package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 机型的配置信息。包括机型的cpu、内存、是否支持组内网等等。
 */
public class InstanceType extends TeaModel {


    /**
     * 机型支持的镜像ID。
     * 仅在DescribeInstanceType可取值
     */
    public List<String> imageIds;

    /**
     * 实例机型ID。
     */
    public String instanceTypeId;

    /**
     * 机型描述。
     * 一般包括内存大小，硬盘。
     */
    public String description;

    /**
     * CPU数量。
     */
    public Integer cpuCoreCount;

    /**
     * CPU详情。
     */
    public String cpuDetail;

    /**
     * CPU核心数。
     */
    public Integer cpuCores;

    /**
     * CPU线程。
     */
    public Integer cpuThreads;

    /**
     * CPU基础频率。
     */
    public String baseFrequency;

    /**
     * 内存大小。
     * 单位：GB。
     */
    public Integer memorySize;

    /**
     * 机型支持的最大出口带宽。
     * 单位：Mbps。
     */
    public Integer maximumBandwidth;

    /**
     * 机型支持的raid。
     */
    public List<Integer> supportRaids;

    /**
     * 是否支持内网组网。
     */
    public Boolean supportSubnet;

    /**
     * 是否是高可用机型。
     */
    public Boolean isHA;

    /**
     * 硬盘配置。
     * 单位：GB。
     */
    public InstanceDiskInfo diskInfo;

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCpuCoreCount() {
        return this.cpuCoreCount;
    }

    public void setCpuCoreCount(Integer cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
    }

    public String getCpuDetail() {
        return this.cpuDetail;
    }

    public void setCpuDetail(String cpuDetail) {
        this.cpuDetail = cpuDetail;
    }

    public Integer getCpuCores() {
        return this.cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public Integer getCpuThreads() {
        return this.cpuThreads;
    }

    public void setCpuThreads(Integer cpuThreads) {
        this.cpuThreads = cpuThreads;
    }

    public String getBaseFrequency() {
        return this.baseFrequency;
    }

    public void setBaseFrequency(String baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    public Integer getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public Integer getMaximumBandwidth() {
        return this.maximumBandwidth;
    }

    public void setMaximumBandwidth(Integer maximumBandwidth) {
        this.maximumBandwidth = maximumBandwidth;
    }

    public List<Integer> getSupportRaids() {
        return this.supportRaids;
    }

    public void setSupportRaids(List<Integer> supportRaids) {
        this.supportRaids = supportRaids;
    }

    public Boolean getSupportSubnet() {
        return this.supportSubnet;
    }

    public void setSupportSubnet(Boolean supportSubnet) {
        this.supportSubnet = supportSubnet;
    }

    public Boolean getIsHA() {
        return this.isHA;
    }

    public void setIsHA(Boolean isHA) {
        this.isHA = isHA;
    }

    public InstanceDiskInfo getDiskInfo() {
        return this.diskInfo;
    }

    public void setDiskInfo(InstanceDiskInfo diskInfo) {
        this.diskInfo = diskInfo;
    }

}