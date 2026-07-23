package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIPTransitsRequest extends TeaModel {


    /**
     * IP Transit ID 列表。
     * 最多支持 100 个 ID 查询。
     */
    public List<String> iptIds;

    /**
     * IP Transit名称。
     * 模糊匹配。
     */
    public String iptName;

    /**
     * 资源组 ID。
     * 不传则返回该用户可见的所有资源组内的IP Transit。
     */
    public String resourceGroupId;

    /**
     * 对端数据中心端口 ID 过滤。
     */
    public String peerPortId;

    /**
     * 本端数据中心 ID 过滤。
     */
    public String iptDcId;

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

    public List<String> getIptIds() {
        return this.iptIds;
    }

    public void setIptIds(List<String> iptIds) {
        this.iptIds = iptIds;
    }

    public String getIptName() {
        return this.iptName;
    }

    public void setIptName(String iptName) {
        this.iptName = iptName;
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

    public String getIptDcId() {
        return this.iptDcId;
    }

    public void setIptDcId(String iptDcId) {
        this.iptDcId = iptDcId;
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