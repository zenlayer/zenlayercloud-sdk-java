package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述内网跨区域带宽的基本信息。
 */
public class CrossRegionBandwidthInfo extends TeaModel {


    /**
     * 内网跨区域带宽的唯一ID
     */
    public String crossRegionBandwidthId;

    /**
     * 内网跨区域带宽的名称
     */
    public String crossRegionBandwidthName;

    /**
     * 内网跨区域带宽的状态
     */
    public String status;

    /**
     * 内网跨区域带宽所属的VPC ID
     */
    public String vpcId;

    /**
     * 内网跨区域带宽的其中一端的区域连接点（A）
     */
    public String regionA;

    /**
     * 内网跨区域带宽的另一端的区域连接点（Z）
     */
    public String regionZ;

    /**
     * 内网跨区域带宽的带宽|保底带宽
     */
    public Integer bandwidth;

    /**
     * 内网跨区域带宽的突发带宽。
     * 该字段可能为null
     */
    public Integer bandwidthCap;

    /**
     * 内网跨区域带宽的创建时间
     */
    public String createTime;

    /**
     * 内网跨区域带宽的网络模型
     */
    public String internetChargeType;

    /**
     * 内网跨区域带宽的到期时间。
     * 该字段可能为null
     */
    public String expiredTime;

    /**
     * 内网跨区域带宽的所属的资源组
     */
    public String resourceGroupId;

    /**
     * 内网跨区域带宽的所属资源组的名称
     */
    public String resourceGroupName;

    public String getCrossRegionBandwidthId() {
        return this.crossRegionBandwidthId;
    }

    public void setCrossRegionBandwidthId(String crossRegionBandwidthId) {
        this.crossRegionBandwidthId = crossRegionBandwidthId;
    }

    public String getCrossRegionBandwidthName() {
        return this.crossRegionBandwidthName;
    }

    public void setCrossRegionBandwidthName(String crossRegionBandwidthName) {
        this.crossRegionBandwidthName = crossRegionBandwidthName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getRegionA() {
        return this.regionA;
    }

    public void setRegionA(String regionA) {
        this.regionA = regionA;
    }

    public String getRegionZ() {
        return this.regionZ;
    }

    public void setRegionZ(String regionZ) {
        this.regionZ = regionZ;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getBandwidthCap() {
        return this.bandwidthCap;
    }

    public void setBandwidthCap(Integer bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

}