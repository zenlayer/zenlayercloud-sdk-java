package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeQosPolicyGroupsRequest extends TeaModel {


    /**
     * QoS策略组ID列表。
     * 最多支持100个ID查询。
     */
    public List<String> qosPolicyGroupIds;

    /**
     * QoS策略组所在地域ID。
     */
    public String regionId;

    /**
     * 根据资源组ID进行过滤。
     */
    public String resourceGroupId;

    /**
     * 成员资源ID（EIP、IPv6或UNMANAGED出口IP的console侧UUID）。
     * 返回包含该资源的策略组。
     */
    public String resourceId;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     * 默认为1。
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

    public List<String> getQosPolicyGroupIds() {
        return this.qosPolicyGroupIds;
    }

    public void setQosPolicyGroupIds(List<String> qosPolicyGroupIds) {
        this.qosPolicyGroupIds = qosPolicyGroupIds;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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