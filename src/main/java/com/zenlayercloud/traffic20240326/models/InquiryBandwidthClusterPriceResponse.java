package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class InquiryBandwidthClusterPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * price
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