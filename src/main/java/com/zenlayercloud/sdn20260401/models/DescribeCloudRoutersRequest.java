package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCloudRoutersRequest extends TeaModel {


    /**
     * 三层网络的 ID 列表。
     * 长度不超过 100 个。
     */
    public List<String> cloudRouterIds;

    /**
     * 三层网络名称。
     * 支持模糊匹配。
     */
    public String cloudRouterName;

    /**
     * 三层网络的状态。
     */
    public String cloudRouterStatus;

    /**
     * 边缘连接点的 ID。
     */
    public String edgePointId;

    /**
     * 资源组 ID。
     * 不传则返回所有可见资源组内的三层网络。
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小。
     * 默认为 20，最大为 1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     * 默认为 1。
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

    public List<String> getCloudRouterIds() {
        return this.cloudRouterIds;
    }

    public void setCloudRouterIds(List<String> cloudRouterIds) {
        this.cloudRouterIds = cloudRouterIds;
    }

    public String getCloudRouterName() {
        return this.cloudRouterName;
    }

    public void setCloudRouterName(String cloudRouterName) {
        this.cloudRouterName = cloudRouterName;
    }

    public String getCloudRouterStatus() {
        return this.cloudRouterStatus;
    }

    public void setCloudRouterStatus(String cloudRouterStatus) {
        this.cloudRouterStatus = cloudRouterStatus;
    }

    public String getEdgePointId() {
        return this.edgePointId;
    }

    public void setEdgePointId(String edgePointId) {
        this.edgePointId = edgePointId;
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