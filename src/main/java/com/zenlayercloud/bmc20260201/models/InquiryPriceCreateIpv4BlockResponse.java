package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateIpv4BlockResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * Cidr Block价格。
     */
    public PriceItem price;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

}