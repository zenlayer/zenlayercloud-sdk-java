package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeIPTransitsRequest extends TeaModel {


    /**
     * IP Transit ID列表。
     * 最大支持长度为100。
     */
    public List<String> iptIds;

    /**
     * IPT 名称。
     * 支持模糊搜索。
     */
    public String iptName;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 端口ID。
     * 通过该字段可以筛选与指定端口有关的IP Transit。
     */
    public String peerPortId;

    /**
     * 数据中心ID。
     * 具体取值可通过调用接口DescribeDataCenters来获得最新的数据中心列表。
     */
    public String iptDcId;

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
     * 根据标签进行搜索。
     * 最长不得超过20个标签。
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