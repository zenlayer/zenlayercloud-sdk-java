package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述创建NAT网关的响应。
 */
public class InquiryPriceCreateNatGatewayResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * NAT网关的价格
     */
    public PriceItem natGatewayPrice;

    /**
     * NAT网关CU的价格
     */
    public PriceItem cuPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getNatGatewayPrice() {
        return this.natGatewayPrice;
    }

    public void setNatGatewayPrice(PriceItem natGatewayPrice) {
        this.natGatewayPrice = natGatewayPrice;
    }

    public PriceItem getCuPrice() {
        return this.cuPrice;
    }

    public void setCuPrice(PriceItem cuPrice) {
        this.cuPrice = cuPrice;
    }

}