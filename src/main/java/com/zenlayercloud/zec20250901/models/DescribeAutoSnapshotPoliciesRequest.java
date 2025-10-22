package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 自动快照策略列表的请求参数。
 */
public class DescribeAutoSnapshotPoliciesRequest extends TeaModel {


    /**
     * 根据自动快照策略的ID进行过滤
     */
    public List<String> autoSnapshotPolicyIds;

    /**
     * 根据自动快照策略的可用区ID进行过滤
     */
    public List<String> zoneIds;

    /**
     * 根据自动快照策略的名称进行过滤。
     * 该字段支持模糊搜索
     */
    public String autoSnapshotPolicyName;

    /**
     * 根据资源组ID进行过滤
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签
     */
    public List<Tag> tags;

    public List<String> getAutoSnapshotPolicyIds() {
        return this.autoSnapshotPolicyIds;
    }

    public void setAutoSnapshotPolicyIds(List<String> autoSnapshotPolicyIds) {
        this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
    }

    public List<String> getZoneIds() {
        return this.zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
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