package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeVpcsRequest extends TeaModel {


    /**
     * VPC ID。
     * 取值可以由多个VPC ID组成一个。最多支持100个ID查询。
     */
    public List<String> vpcIds;

    /**
     * VPC的名称。
     */
    public String vpcName;

    /**
     * VPC的CIDR。
     */
    public String cidrBlock;

    /**
     * VPC的状态。
     */
    public String vpcStatus;

    /**
     * VPC的节点ID。
     */
    public String vpcRegionId;

    /**
     * 资源组的ID。
     * 如果不传，则返回该用户可见的所有资源组内的VPC。
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
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

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getVpcStatus() {
        return this.vpcStatus;
    }

    public void setVpcStatus(String vpcStatus) {
        this.vpcStatus = vpcStatus;
    }

    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public void setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
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