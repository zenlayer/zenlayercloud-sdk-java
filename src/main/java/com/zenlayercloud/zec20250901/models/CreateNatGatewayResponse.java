package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateNatGatewayResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 下单编号
     */
    public String orderNumber;

    /**
     * NAT网关唯一ID
     */
    public String natGatewayId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

}