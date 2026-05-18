package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiGatewaysRequest extends TeaModel {


    /**
     * AI网关UUID列表。
     */
    public List<String> gatewayUuids;

    /**
     * AI网关名称。
     */
    public String gatewayName;

    /**
     * AI网关状态。
     */
    public String status;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 分页每页数量。
     */
    public Integer pageSize;

    /**
     * 分页页码。
     */
    public Integer pageNum;

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

    public List<String> getGatewayUuids() {
        return this.gatewayUuids;
    }

    public void setGatewayUuids(List<String> gatewayUuids) {
        this.gatewayUuids = gatewayUuids;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
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