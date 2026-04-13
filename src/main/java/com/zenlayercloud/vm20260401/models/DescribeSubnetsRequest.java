package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSubnetsRequest extends TeaModel {


    /**
     * 子网所属的可用区ID。
     */
    public String zoneId;

    /**
     * 子网 ID。
     * 取值可以由多个Subnet ID组成一个。
     * 最多支持100个ID查询。
     */
    public List<String> subnetIds;

    /**
     * 子网的CIDR。
     * 支持模糊查询。
     */
    public String cidrBlock;

    /**
     * Subnet的状态。
     */
    public String subnetStatus;

    /**
     * 子网的名称。
     * 支持模糊查询。
     */
    public String subnetName;

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

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getSubnetStatus() {
        return this.subnetStatus;
    }

    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
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