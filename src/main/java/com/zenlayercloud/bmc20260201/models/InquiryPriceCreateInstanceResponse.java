package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceCreateInstanceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例价格。
     */
    public PriceItem instancePrice;

    /**
     * 公网带宽价格。
     * 可能有多个价格，比如流量包计费，包含包的价格和用量超出包后的价格
     */
    public List<PriceItem> bandwidthPrice;

    /**
     * 主IP的价格。
     */
    public PriceItem primaryIpPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getInstancePrice() {
        return this.instancePrice;
    }

    public void setInstancePrice(PriceItem instancePrice) {
        this.instancePrice = instancePrice;
    }

    public List<PriceItem> getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(List<PriceItem> bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

    public PriceItem getPrimaryIpPrice() {
        return this.primaryIpPrice;
    }

    public void setPrimaryIpPrice(PriceItem primaryIpPrice) {
        this.primaryIpPrice = primaryIpPrice;
    }

}