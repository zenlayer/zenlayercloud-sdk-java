package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeUnmanagedEgressIpsRequest extends TeaModel {


    /**
     * 按照非托管出口IP的唯一ID过滤，每次请求最多支持100个。
     */
    public List<String> unmanagedEgressIpIds;

    /**
     * 按照节点ID过滤。
     */
    public String regionId;

    /**
     * 按照所属VPC的唯一ID过滤。
     */
    public String vpcId;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     */
    public Integer pageNum;

    public List<String> getUnmanagedEgressIpIds() {
        return this.unmanagedEgressIpIds;
    }

    public void setUnmanagedEgressIpIds(List<String> unmanagedEgressIpIds) {
        this.unmanagedEgressIpIds = unmanagedEgressIpIds;
    }

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