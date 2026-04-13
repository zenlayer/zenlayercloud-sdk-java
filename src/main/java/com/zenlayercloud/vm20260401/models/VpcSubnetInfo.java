package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * VPC子网信息。
 */
public class VpcSubnetInfo extends TeaModel {


    /**
     * Subnet的ID。
     */
    public String subnetId;

    /**
     * Subnet所属VPC的ID。
     */
    public String vpcId;

    /**
     * Subnet的名称。
     */
    public String subnetName;

    /**
     * Subnet的状态。
     */
    public String subnetStatus;

    /**
     * Subnet的CIDR。
     */
    public String cidrBlock;

    /**
     * Subnet下绑定的实例列表。
     */
    public List<String> instanceIdList;

    /**
     * Subnet的创建时间。
     */
    public String createTime;

    /**
     * Subnet的已用IP数。
     */
    public Integer usageIpCount;

    /**
     * Subnet的总IP数。
     */
    public Integer totalIpCount;

    /**
     * Subnet是否默认。
     */
    public Boolean isDefault;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getSubnetStatus() {
        return this.subnetStatus;
    }

    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUsageIpCount() {
        return this.usageIpCount;
    }

    public void setUsageIpCount(Integer usageIpCount) {
        this.usageIpCount = usageIpCount;
    }

    public Integer getTotalIpCount() {
        return this.totalIpCount;
    }

    public void setTotalIpCount(Integer totalIpCount) {
        this.totalIpCount = totalIpCount;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

}