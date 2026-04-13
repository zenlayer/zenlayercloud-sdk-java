package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceInstanceTrafficPackageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 流量包价格。
     */
    public List<PriceItem> trafficPackagePrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PriceItem> getTrafficPackagePrice() {
        return this.trafficPackagePrice;
    }

    public void setTrafficPackagePrice(List<PriceItem> trafficPackagePrice) {
        this.trafficPackagePrice = trafficPackagePrice;
    }

}