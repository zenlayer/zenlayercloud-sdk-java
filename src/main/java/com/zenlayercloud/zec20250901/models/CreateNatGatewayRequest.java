package com.zenlayercloud.zec20250901.models;

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
     * NAT网关所属的Subnet子网ID集合。
     * 如果未指定，则指定区域的所有子网将自动关联NAT网关
     */
    public List<String> subnetIds;

    /**
     * 安全组ID。
     * 如果未指定，则指定VPC所属的安全组ID
     */
    public String securityGroupId;

    /**
     * 资源组ID。
     * 如果不指定，则会创建在默认资源组
     */
    public String resourceGroupId;

    /**
     * 创建NAT网关时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

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

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}