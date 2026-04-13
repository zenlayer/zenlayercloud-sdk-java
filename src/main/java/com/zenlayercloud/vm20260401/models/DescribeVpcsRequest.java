package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeVpcsRequest extends TeaModel {


    /**
     * VPC ID。
     * 取值可以由多个VPC ID组成一个。
     * 最多支持100个ID查询。
     */
    public List<String> vpcIds;

    /**
     * VPC的CIDR。
     * 支持模糊查询。
     */
    public String cidrBlock;

    /**
     * VPC所属的可用区ID。
     */
    public String zoneId;

    /**
     * VPC的状态。
     */
    public String vpcStatus;

    /**
     * VPC的名称。
     * 支持模糊查询。
     */
    public String vpcName;

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

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getVpcStatus() {
        return this.vpcStatus;
    }

    public void setVpcStatus(String vpcStatus) {
        this.vpcStatus = vpcStatus;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
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