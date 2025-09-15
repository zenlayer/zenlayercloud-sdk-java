package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNatGatewaysRequest extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 根据NAT网关所属的VPC网络 ID过滤
     */
    public String vpcId;

    /**
     * NAT网关ID集合。
     * 实例ID数量上限为100个
     */
    public List<String> natGatewayIds;

    /**
     * NAT网关名称
     */
    public String name;

    /**
     * NAT网关状态
     */
    public String status;

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
     * 资源组ID
     */
    public String resourceGroupId;

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

    public List<String> getNatGatewayIds() {
        return this.natGatewayIds;
    }

    public void setNatGatewayIds(List<String> natGatewayIds) {
        this.natGatewayIds = natGatewayIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}