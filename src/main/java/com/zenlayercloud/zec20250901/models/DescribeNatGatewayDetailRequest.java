package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeNatGatewayDetailRequest extends TeaModel {


    /**
     * NAT网关ID。
     * 可通过调用 ~~DescribeNatGateways~~ 获取。
     */
    public String natGatewayId;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

}