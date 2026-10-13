package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyIpv6BandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 公网IPv6的保留价格。
     */
    public PriceItem ipv6Price;

    /**
     * 公网IPv6的带宽价格。
     */
    public PriceItem bandwidthPrice;

    /**
     * 变更前各计费项当前生效的价格，字段与上方一一对应，用于对比出哪些计费项发生了调价。
     * 无订单时为null。
     */
    public Ipv6PreviousPrices previousPrices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getIpv6Price() {
        return this.ipv6Price;
    }

    public void setIpv6Price(PriceItem ipv6Price) {
        this.ipv6Price = ipv6Price;
    }

    public PriceItem getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(PriceItem bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

    public Ipv6PreviousPrices getPreviousPrices() {
        return this.previousPrices;
    }

    public void setPreviousPrices(Ipv6PreviousPrices previousPrices) {
        this.previousPrices = previousPrices;
    }

}