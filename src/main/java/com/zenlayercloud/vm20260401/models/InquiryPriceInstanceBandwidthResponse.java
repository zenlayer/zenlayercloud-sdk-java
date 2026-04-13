package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceInstanceBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 公网带宽价格。
     */
    public List<PriceItem> bandwidthPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PriceItem> getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(List<PriceItem> bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

}