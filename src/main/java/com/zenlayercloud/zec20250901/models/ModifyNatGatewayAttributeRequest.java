package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改Nat网关属性的请求
 */
public class ModifyNatGatewayAttributeRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * NAT网关的名称。
     * 长度为2～63个字符
     */
    public String name;

    /**
     * NAT网关的子网ID
     */
    public List<String> subnetIds;

    /**
     * NAT网关对应的子网是否应用所有子网。
     * 该字段不能和`subnetIds`同时设置
     */
    public Boolean isAllSubnet;

    /**
     * 是否开启ICMP代回
     */
    public Boolean icmpReplyEnabled;

    /**
     * 修改NAT网关绑定的目标安全组ID。
     * 目前一张NAT网关只能关联一个安全组。
     * 指定该字段会解绑NAT网关原来的安全组
     */
    public String securityGroupId;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
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

    public Boolean getIsAllSubnet() {
        return this.isAllSubnet;
    }

    public void setIsAllSubnet(Boolean isAllSubnet) {
        this.isAllSubnet = isAllSubnet;
    }

    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public void setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}