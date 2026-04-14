package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryCreateIPTransitPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * IP Transit 的 专线价格。
     * 如果IP Transit 和端口位于同一个数据中心，则取值为null。
     */
    public PriceItem privateConnectPrice;

    /**
     * IP Transit 的公网带宽价格。
     */
    public PriceItem iptBandwidthPrice;

    /**
     * IP Transit 的公网IP价格。
     */
    public List<IPPrice> publicIpPrices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getPrivateConnectPrice() {
        return this.privateConnectPrice;
    }

    public void setPrivateConnectPrice(PriceItem privateConnectPrice) {
        this.privateConnectPrice = privateConnectPrice;
    }

    public PriceItem getIptBandwidthPrice() {
        return this.iptBandwidthPrice;
    }

    public void setIptBandwidthPrice(PriceItem iptBandwidthPrice) {
        this.iptBandwidthPrice = iptBandwidthPrice;
    }

    public List<IPPrice> getPublicIpPrices() {
        return this.publicIpPrices;
    }

    public void setPublicIpPrices(List<IPPrice> publicIpPrices) {
        this.publicIpPrices = publicIpPrices;
    }

}