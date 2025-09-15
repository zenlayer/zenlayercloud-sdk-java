package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述NAT网关的信息。
 */
public class NatGateway extends TeaModel {


    /**
     * NAT网关唯一ID
     */
    public String natGatewayId;

    /**
     * NAT网关所属的VPC网络ID
     */
    public String vpcId;

    /**
     * 区域节点ID
     */
    public String regionId;

    /**
     * NAT网关的状态
     */
    public String status;

    /**
     * NAT网关的名称
     */
    public String name;

    /**
     * NAT网关所属的Subnet子网ID集合
     */
    public List<String> subnetIds;

    /**
     * 是否节点内所有子网关联了NAT网关
     */
    public Boolean isAllSubnets;

    /**
     * NAT网关所关联的EIP ID集合
     */
    public List<String> eipIds;

    /**
     * 边界网关ID
     */
    public String zbgId;

    /**
     * 是否开启ICMP代回。
     * 默认值：true
     */
    public Boolean icmpReplyEnabled;

    /**
     * 资源组ID
     */
    public String resourceGroupId;

    /**
     * 资源组名称
     */
    public String resourceGroupName;

    /**
     * 创建时间。
     * 按照ISO8601标准表示，并且使用UTC时间, 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String createTime;

    /**
     * 到期时间。
     * 按照ISO8601标准表示，并且使用UTC时间, 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String expiredTime;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Boolean getIsAllSubnets() {
        return this.isAllSubnets;
    }

    public void setIsAllSubnets(Boolean isAllSubnets) {
        this.isAllSubnets = isAllSubnets;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public Boolean getAllSubnets() {
        return isAllSubnets;
    }

    public void setAllSubnets(Boolean allSubnets) {
        isAllSubnets = allSubnets;
    }

    public Boolean getIcmpReplyEnabled() {
        return icmpReplyEnabled;
    }

    public void setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

}