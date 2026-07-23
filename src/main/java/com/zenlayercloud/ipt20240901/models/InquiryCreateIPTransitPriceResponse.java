package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryCreateIPTransitPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 二层网络专线价格。
     * 可能为空。
     */
    public PriceItem privateConnectPrice;

    /**
     * IP Transit带宽价格。
     */
    public PriceItem iptBandwidthPrice;

    /**
     * 公网 IP 价格列表。
     */
    public List<IPPrice> publicIpPrices;

    /**
     * 公网互联 IP 价格。
     * 仅 publicInterconnectNetmask 非空时返回。
     */
    public IPPrice publicInterconnectIpPrice;

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

    public IPPrice getPublicInterconnectIpPrice() {
        return this.publicInterconnectIpPrice;
    }

    public void setPublicInterconnectIpPrice(IPPrice publicInterconnectIpPrice) {
        this.publicInterconnectIpPrice = publicInterconnectIpPrice;
    }

}