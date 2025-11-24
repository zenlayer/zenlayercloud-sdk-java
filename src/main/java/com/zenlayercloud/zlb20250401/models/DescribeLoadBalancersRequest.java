package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeLoadBalancersRequest extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 根据负载均衡后端服务器所属的VPC网络 ID过滤
     */
    public String vpcId;

    /**
     * 负载均衡实例ID集合。
     * 实例ID数量上限为100个
     */
    public List<String> loadBalancerIds;

    /**
     * 负载均衡实例名称。
     * 可以在末尾加入*以支持模糊匹配
     */
    public String loadBalancerName;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     * 默认为1
     */
    public Integer pageNum;

    /**
     * resourceGroupId
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

    /**
     * 负载均衡实例绑定的安全组ID
     */
    public String securityGroupId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
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

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}