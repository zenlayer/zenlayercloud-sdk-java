package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询CIDR列表的请求信息。
 */
public class DescribeCidrsRequest extends TeaModel {


    /**
     * 一个或多个待操作的Cidr ID，根据cidrId进行过滤
     */
    public List<String> cidrIds;

    /**
     * 根据CIDR所在的节点ID进行过滤
     */
    public String regionId;

    /**
     * 根据CIDR名称进行过滤，支持模糊查询
     */
    public String name;

    /**
     * 根据CIDR地址进行过滤
     */
    public String cidrBlock;

    /**
     * 根据CIDR来源进行过滤
     */
    public String source;

    /**
     * 根据资源组ID进行过滤
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小，默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    public List<String> getCidrIds() {
        return this.cidrIds;
    }

    public void setCidrIds(List<String> cidrIds) {
        this.cidrIds = cidrIds;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
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

}