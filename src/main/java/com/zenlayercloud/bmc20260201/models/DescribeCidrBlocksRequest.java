package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCidrBlocksRequest extends TeaModel {


    /**
     * Cidr Block ID。
     * 最多支持100个ID查询。
     */
    public List<String> cidrBlockIds;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * Cidr Block名称。
     */
    public String cidrBlockName;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * CIDR地址块的类型。
     */
    public String cidrBlockType;

    /**
     * 网关地址。
     */
    public String gateway;

    /**
     * 计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 资源组的ID。
     * 如果不传，则返回该用户可见的所有资源组内的Cidr Block。
     */
    public String resourceGroupId;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键。
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签。
     */
    public List<Tag> tags;

    public List<String> getCidrBlockIds() {
        return this.cidrBlockIds;
    }

    public void setCidrBlockIds(List<String> cidrBlockIds) {
        this.cidrBlockIds = cidrBlockIds;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
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

    public String getCidrBlockType() {
        return this.cidrBlockType;
    }

    public void setCidrBlockType(String cidrBlockType) {
        this.cidrBlockType = cidrBlockType;
    }

    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}