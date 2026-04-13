package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceInstanceTrafficPackageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 流量包价格。
     * 可能有多个价格，比如流量包计费，包含包的价格和用量超出包后的价格。
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