package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class InquiryBandwidthClusterPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 描述带宽包的价格信息。
     */
    public PriceItem price;

    /**
     * 国际线路价格信息。
     * 仅 PathBasedBandwidth 线路返回。
     */
    public PriceItem internationalPrice;

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

    public PriceItem getInternationalPrice() {
        return this.internationalPrice;
    }

    public void setInternationalPrice(PriceItem internationalPrice) {
        this.internationalPrice = internationalPrice;
    }

}