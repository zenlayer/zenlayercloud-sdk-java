package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 获取可绑定NAT的边界网关的请求信息。
 */
public class DescribeAvailableBorderGatewayRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

}