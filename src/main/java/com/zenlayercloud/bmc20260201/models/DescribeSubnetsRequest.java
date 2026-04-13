package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSubnetsRequest extends TeaModel {


    /**
     * Subnet ID。
     * 取值可以由多个Subnet ID组成一个。最多支持100个ID查询。
     */
    public List<String> subnetIds;

    /**
     * Subnet的名称。
     */
    public String subnetName;

    /**
     * Subnet的CIDR。
     */
    public String cidrBlock;

    /**
     * Subnet的状态。
     */
    public String subnetStatus;

    /**
     * Subnet所属的可用区ID。
     */
    public String zoneId;

    /**
     * VPC ID。
     */
    public String vpcId;

    /**
     * 资源组的ID。
     * 如果不传，则返回该用户可见的所有资源组内的Subnet。
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

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
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

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
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