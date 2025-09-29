package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNetworkInterfacesRequest extends TeaModel {


    /**
     * 根据网卡ID过滤。
     * 最多传入100个ID
     */
    public List<String> nicIds;

    /**
     * 根据网卡所属的名称过滤。
     * 该字段支持模糊搜索
     */
    public String name;

    /**
     * 根据网卡所属的节点 ID过滤
     */
    public String regionId;

    /**
     * 根据网卡所属的VPC ID过滤
     */
    public String vpcId;

    /**
     * 根据网卡所属的子网ID过滤
     */
    public String subnetId;

    /**
     * 网卡关联的实例ID过滤
     */
    public String instanceId;

    /**
     * 根据网卡的状态过滤
     */
    public String status;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    /**
     * 根据网卡的类型筛选过滤
     */
    public String nicType;

    /**
     * 根据网卡所属的资源组ID过滤
     */
    public String resourceGroupId;

    /**
     * 根据网卡所属的安全组ID过滤
     */
    public String securityGroupId;

    public List<String> getNicIds() {
        return this.nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
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

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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

    public String getNicType() {
        return this.nicType;
    }

    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}