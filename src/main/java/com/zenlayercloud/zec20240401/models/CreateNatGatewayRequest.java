package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateNatGatewayRequest extends TeaModel {


    /**
     * 区域节点ID
     */
    public String regionId;

    /**
     * NAT网关所属的VPC网络ID
     */
    public String vpcId;

    /**
     * NAT网关的名称。
     * 长度为2～63个字符
     */
    public String name;

    /**
     * NAT网关所属的Subnet子网ID集合
     */
    public List<String> subnetIds;

    /**
     * 资源组ID。
     * 如果不指定，则会创建在默认资源组
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}