package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * CIDR信息详情。
 */
public class CidrInfo extends TeaModel {


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
     * CIDR地址块，例如：10.0.0.0/16
     */
    public String cidrBlock;

    /**
     * CIDR中IP地址的总数量
     */
    public Integer totalCount;

    /**
     * CIDR中已被使用的IP地址数量
     */
    public Integer usedCount;

    /**
     * CIDR的来源。
     * 如CONSOLE（属于zenlayer）或 BYOIP（客户自带IP）
     */
    public String source;

    /**
     * EIP网络类型。
     * 表示该CIDR支持的公网IP线路类型
     */
    public String eipV4Type;

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
    public String resourceGroupId;

    /**
     * 该CIDR所属资源组的名称
     */
    public String resourceGroupName;

    /**
     * CIDR的状态
     */
    public String status;

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

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUsedCount() {
        return this.usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}