package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * IPv6 CIDR信息详情。
 */
public class Ipv6CidrInfo extends TeaModel {


    /**
     * CIDR ID
     */
    public String cidrId;

    /**
     * CIDR所属的区域节点ID
     */
    public String regionId;

    /**
     * CIDR的名称
     */
    public String name;

    /**
     * CIDR地址块，例如：2400:8a00::/28
     */
    public String cidrBlock;

    /**
     * CIDR的来源。
     * 如CONSOLE（属于zenlayer）或 BYOIP（客户自带IP）
     */
    public String source;

    /**
     * CIDR网络类型。
     * 表示该CIDR支持的公网IP线路类型
     */
    public String networkLineType;

    /**
     * 子网ID集合
     */
    public List<String> subnetIds;

    /**
     * 网卡ID集合
     */
    public List<String> nicIds;

    /**
     * 子网掩码。
     * 表示CIDR的网络位长度
     */
    public Integer netmask;

    /**
     * Pool的ID。
     * 表示该CIDR所属的公网IP池
     */
    public String poolId;

    /**
     * CIDR的创建时间
     */
    public String createTime;

    /**
     * CIDR的到期时间
     */
    public String expiredTime;

    /**
     * 该CIDR所属的资源组
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * CIDR的状态
     */
    public String status;

    /**
     * 该CIDR地址段关联的标签
     */
    public Tags tags;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public List<String> getNicIds() {
        return this.nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getPoolId() {
        return this.poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}