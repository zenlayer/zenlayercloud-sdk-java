package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeVpcsRequest extends TeaModel {


    /**
     * VPC的ID列表。
     * 最多可传100个ID
     */
    public List<String> vpcIds;

    /**
     * 根据VPC名称过滤。
     * 支持模糊查询
     */
    public String name;

    /**
     * 根据VPC的IPv4 CIDR过滤。
     * 支持模糊查询
     */
    public String cidrBlock;

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

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
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