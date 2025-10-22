package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述VPC的基本信息。
 */
public class VpcInfo extends TeaModel {


    /**
     * VPC的ID
     */
    public String vpcId;

    /**
     * VPC的名称
     */
    public String name;

    /**
     * VPC的IPv4 CIDR
     */
    public String cidrBlock;

    /**
     * VPC的内网IPv6 CIDR。
     * 如果为null,说明未开启IPv6
     */
    public String ipv6CidrBlock;

    /**
     * mtu值
     */
    public Integer mtu;

    /**
     * 是否为默认VPC
     */
    public Boolean isDefault;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * VPC里已使用IPv4数量
     */
    public Integer usageIpv4Count;

    /**
     * VPC里已使用IPv6数量
     */
    public Integer usageIpv6Count;

    /**
     * 关联的安全组ID
     */
    public String securityGroupId;

    /**
     * VPC关联的资源组信息
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 该VPC关联的标签
     */
    public Tags tags;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
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

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}