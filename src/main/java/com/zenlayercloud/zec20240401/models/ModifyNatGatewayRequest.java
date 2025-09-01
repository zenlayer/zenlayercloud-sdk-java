package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyNatGatewayRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * NAT网关的subnet ID 不传为all
     */
    public List<String> subnetIds;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}