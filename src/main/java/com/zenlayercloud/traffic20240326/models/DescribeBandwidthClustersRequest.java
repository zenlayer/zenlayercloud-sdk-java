package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeBandwidthClustersRequest extends TeaModel {


    /**
     * 共享带宽包ID。
     * 最多支持100个ID查询。
     */
    public List<String> bandwidthClusterIds;

    /**
     * 共享带宽包显示名称。
     * 支持模糊匹配。
     */
    public String bandwidthClusterName;

    /**
     * 共享带宽包所包含的城市名称。
     */
    public String cityName;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageNum;

    /**
     * 返回的分页数。
     */
    public Integer pageSize;

    /**
     * 根据资源组ID过滤。
     */
    public String resourceGroupId;

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

    public List<String> getBandwidthClusterIds() {
        return this.bandwidthClusterIds;
    }

    public void setBandwidthClusterIds(List<String> bandwidthClusterIds) {
        this.bandwidthClusterIds = bandwidthClusterIds;
    }

    public String getBandwidthClusterName() {
        return this.bandwidthClusterName;
    }

    public void setBandwidthClusterName(String bandwidthClusterName) {
        this.bandwidthClusterName = bandwidthClusterName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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