package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeHaVipsRequest extends TeaModel {


    /**
     * HaVip ID列表。
     * 最多支持100个ID查询。
     */
    public List<String> haVipIds;

    /**
     * HaVip名称，支持模糊查询。
     */
    public String name;

    /**
     * 所在地域ID。
     */
    public String regionId;

    /**
     * 所属VPC ID列表。
     */
    public List<String> vpcIds;

    /**
     * 所属子网ID列表。
     */
    public List<String> subnetIds;

    /**
     * 私网IP地址列表。
     */
    public List<String> ipAddresses;

    /**
     * 实例ID列表，返回绑定了指定实例的高可用虚拟IP。
     */
    public List<String> instanceIds;

    /**
     * 分页大小，最大为1000。
     */
    public Integer pageSize;

    /**
     * 分页页码。
     */
    public Integer pageNum;

    /**
     * 根据标签键进行搜索。
     * 最多支持20个标签键。
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最多支持20个标签。
     */
    public List<Tag> tags;

    public List<String> getHaVipIds() {
        return this.haVipIds;
    }

    public void setHaVipIds(List<String> haVipIds) {
        this.haVipIds = haVipIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
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