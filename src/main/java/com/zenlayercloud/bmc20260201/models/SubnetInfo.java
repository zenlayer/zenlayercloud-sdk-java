package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * Subnet Info的信息。
 */
public class SubnetInfo extends TeaModel {


    /**
     * Subnet唯一ID。
     */
    public String subnetId;

    /**
     * Subnet的名称。
     */
    public String subnetName;

    /**
     * Subnet所属的可用区ID。
     */
    public String zoneId;

    /**
     * Subnet下可用的IP数量。
     */
    public Integer availableIpCount;

    /**
     * Subnet的CIDR。
     */
    public String cidrBlock;

    /**
     * Subnet的状态。
     */
    public String subnetStatus;

    /**
     * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-ddTHH:mm:ssZ`。
     */
    public String createTime;

    /**
     * VPC与Subnet的绑定状态。
     */
    public String vpcSubnetStatus;

    /**
     * VPC唯一ID。
     */
    public String vpcId;

    /**
     * VPC的名称。
     */
    public String vpcName;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * Subnet下实例集合。
     */
    public List<SubnetInstance> subnetInstanceSet;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getAvailableIpCount() {
        return this.availableIpCount;
    }

    public void setAvailableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getSubnetStatus() {
        return this.subnetStatus;
    }

    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getVpcSubnetStatus() {
        return this.vpcSubnetStatus;
    }

    public void setVpcSubnetStatus(String vpcSubnetStatus) {
        this.vpcSubnetStatus = vpcSubnetStatus;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
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

    public List<SubnetInstance> getSubnetInstanceSet() {
        return this.subnetInstanceSet;
    }

    public void setSubnetInstanceSet(List<SubnetInstance> subnetInstanceSet) {
        this.subnetInstanceSet = subnetInstanceSet;
    }

}