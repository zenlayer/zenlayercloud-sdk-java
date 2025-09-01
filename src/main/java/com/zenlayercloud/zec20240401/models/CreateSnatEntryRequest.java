package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateSnatEntryRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * CIDR网段，不传默认是0.0.0.0/0
     */
    public List<String> cidrs;

    /**
     * SNAT规则添加的eip ID集合。
     * 为空代表加入网关的所有eip
     */
    public List<String> eipIds;

    /**
     * by Subnet的情况, subnet的id集合
     */
    public List<String> subnetIds;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public List<String> getCidrs() {
        return this.cidrs;
    }

    public void setCidrs(List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}