package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInternetsRequest extends TeaModel {


    /**
     * Internet ID 列表。
     * 最多支持 100 个 ID 查询。
     */
    public List<String> internetIds;

    /**
     * Internet名称。
     * 模糊匹配。
     */
    public String internetName;

    /**
     * 资源组 ID。
     * 不传则返回该用户可见的所有资源组内的Internet。
     */
    public String resourceGroupId;

    /**
     * 对端数据中心端口 ID 过滤。
     */
    public String peerPortId;

    /**
     * 本端数据中心 ID 过滤。
     */
    public String internetDcId;

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

    public List<String> getInternetIds() {
        return this.internetIds;
    }

    public void setInternetIds(List<String> internetIds) {
        this.internetIds = internetIds;
    }

    public String getInternetName() {
        return this.internetName;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
    }

    public String getInternetDcId() {
        return this.internetDcId;
    }

    public void setInternetDcId(String internetDcId) {
        this.internetDcId = internetDcId;
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