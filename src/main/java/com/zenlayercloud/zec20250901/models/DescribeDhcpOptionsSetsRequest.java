package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeDhcpOptionsSetsRequest extends TeaModel {


    /**
     * DHCP 选项集的 ID。
     * 最多支持输入 20 个 DHCP 选项集的 ID
     */
    public List<String> dhcpOptionsSetIds;

    /**
     * DHCP 选项集的名称。
     * 该字段支持模糊搜索
     */
    public String dhcpOptionsSetName;

    /**
     * 关联的子网 ID
     */
    public String subnetId;

    /**
     * 返回的分页大小，默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    /**
     * 根据资源组ID过滤
     */
    public String resourceGroupId;

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

    public List<String> getDhcpOptionsSetIds() {
        return this.dhcpOptionsSetIds;
    }

    public void setDhcpOptionsSetIds(List<String> dhcpOptionsSetIds) {
        this.dhcpOptionsSetIds = dhcpOptionsSetIds;
    }

    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
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