package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述子网的基本信息。
 */
public class SubnetInfo extends TeaModel {


    /**
     * 子网的ID
     */
    public String subnetId;

    /**
     * 子网所在节点的ID
     */
    public String regionId;

    /**
     * 子网的名称
     */
    public String name;

    /**
     * 子网的CIDR地址
     */
    public String cidrBlock;

    /**
     * 网关地址
     */
    public String gatewayIpAddress;

    /**
     * 子网的IPv6 CIDR地址段。
     * 如果子网的IP堆栈类型不包括V6,该字段取不到值
     */
    public String ipv6CidrBlock;

    /**
     * IPv6的网关地址
     */
    public String ipv6GatewayIpAddress;

    /**
     * 子网的IP堆栈类型
     */
    public String stackType;

    /**
     * 子网上IPv6类型。
     * 如果子网的IP堆栈类型不包括V6,该字段取不到值
     */
    public String ipv6Type;

    /**
     * 子网所属VPC的ID
     */
    public String vpcId;

    /**
     * 子网所属VPC的名称
     */
    public String vpcName;

    /**
     * 子网已使用IPv4数量
     */
    public Integer usageIpv4Count;

    /**
     * 子网已使用IPv6数量
     */
    public Integer usageIpv6Count;

    /**
     * 子网的创建时间
     */
    public String createTime;

    /**
     * 子网是否为默认
     */
    public Boolean isDefault;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getGatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    public void setGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
    }

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public String getIpv6GatewayIpAddress() {
        return this.ipv6GatewayIpAddress;
    }

    public void setIpv6GatewayIpAddress(String ipv6GatewayIpAddress) {
        this.ipv6GatewayIpAddress = ipv6GatewayIpAddress;
    }

    public String getStackType() {
        return this.stackType;
    }

    public void setStackType(String stackType) {
        this.stackType = stackType;
    }

    public String getIpv6Type() {
        return this.ipv6Type;
    }

    public void setIpv6Type(String ipv6Type) {
        this.ipv6Type = ipv6Type;
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

    public Integer getUsageIpv4Count() {
        return this.usageIpv4Count;
    }

    public void setUsageIpv4Count(Integer usageIpv4Count) {
        this.usageIpv4Count = usageIpv4Count;
    }

    public Integer getUsageIpv6Count() {
        return this.usageIpv6Count;
    }

    public void setUsageIpv6Count(Integer usageIpv6Count) {
        this.usageIpv6Count = usageIpv6Count;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

}