package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePrivateConnectsRequest extends TeaModel {


    /**
     * 二层网络专线 ID 列表。
     * 最多支持 100 个 ID 查询。
     */
    public List<String> privateConnectIds;

    /**
     * 二层网络专线名称。
     * 模糊匹配。
     */
    public String privateConnectName;

    /**
     * 连通性状态过滤。
     */
    public String connectivityStatus;

    /**
     * 二层网络专线业务状态过滤。
     */
    public String privateConnectStatus;

    /**
     * 连接点类型过滤。
     */
    public List<String> endpointTypes;

    /**
     * 资源组 ID。
     * 不传则返回该用户可见的所有资源组内的二层网络专线。
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小。
     * 默认为 20，最大为 1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
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

    public List<String> getPrivateConnectIds() {
        return this.privateConnectIds;
    }

    public void setPrivateConnectIds(List<String> privateConnectIds) {
        this.privateConnectIds = privateConnectIds;
    }

    public String getPrivateConnectName() {
        return this.privateConnectName;
    }

    public void setPrivateConnectName(String privateConnectName) {
        this.privateConnectName = privateConnectName;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public String getPrivateConnectStatus() {
        return this.privateConnectStatus;
    }

    public void setPrivateConnectStatus(String privateConnectStatus) {
        this.privateConnectStatus = privateConnectStatus;
    }

    public List<String> getEndpointTypes() {
        return this.endpointTypes;
    }

    public void setEndpointTypes(List<String> endpointTypes) {
        this.endpointTypes = endpointTypes;
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