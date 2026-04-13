package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * CIDR 地址快的信息。
 */
public class CidrBlockInfo extends TeaModel {


    /**
     * Cidr Block唯一ID。
     */
    public String cidrBlockId;

    /**
     * CIDR的类型。
     */
    public String cidrBlockType;

    /**
     * CIDR地址块的类型。
     */
    public String cidrType;

    /**
     * Cidr Block名称。
     */
    public String cidrBlockName;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * 网关地址。
     */
    public String gateway;

    /**
     * 可用IP的开头。
     */
    public String availableIpStart;

    /**
     * 可用IP的结尾。
     */
    public String availableIpEnd;

    /**
     * 可用IP的数量。
     */
    public Integer availableIpCount;

    /**
     * 已绑定的实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * Cidr Block状态。
     */
    public String status;

    /**
     * 计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String expireTime;

    /**
     * 所属资源组的ID。
     */
    public String resourceGroupId;

    /**
     * 所属资源组的名称。
     */
    public String resourceGroupName;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

    public String getCidrBlockType() {
        return this.cidrBlockType;
    }

    public void setCidrBlockType(String cidrBlockType) {
        this.cidrBlockType = cidrBlockType;
    }

    public String getCidrType() {
        return this.cidrType;
    }

    public void setCidrType(String cidrType) {
        this.cidrType = cidrType;
    }

    public String getCidrBlockName() {
        return this.cidrBlockName;
    }

    public void setCidrBlockName(String cidrBlockName) {
        this.cidrBlockName = cidrBlockName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getAvailableIpStart() {
        return this.availableIpStart;
    }

    public void setAvailableIpStart(String availableIpStart) {
        this.availableIpStart = availableIpStart;
    }

    public String getAvailableIpEnd() {
        return this.availableIpEnd;
    }

    public void setAvailableIpEnd(String availableIpEnd) {
        this.availableIpEnd = availableIpEnd;
    }

    public Integer getAvailableIpCount() {
        return this.availableIpCount;
    }

    public void setAvailableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
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

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}