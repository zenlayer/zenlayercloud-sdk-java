package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述实例列表的请求参数。
 */
public class DescribeInstancesRequest extends TeaModel {


    /**
     * 根据实例ID列表进行筛选。
     * 最大不能超过100个
     */
    public List<String> instanceIds;

    /**
     * 实例所属的可用区ID
     */
    public String zoneId;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 根据实例关联的IPv4过滤
     */
    public String ipv4Address;

    /**
     * 根据实例关联的IPv6信息过滤
     */
    public String ipv6Address;

    /**
     * 根据实例的状态过滤
     */
    public String status;

    /**
     * 根据实例显示名称过滤。
     * 该字段支持模糊搜索
     */
    public String name;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
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

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getIpv4Address() {
        return this.ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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