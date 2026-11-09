package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryCreateInternetPriceResponse extends TeaModel {


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
     * Internet带宽价格。
     */
    public PriceItem internetBandwidthPrice;

    /**
     * 公网 IP 价格列表。
     */
    public List<InternetIpPrice> publicIpPrices;

    /**
     * 公网互联 IP 价格。
     * 仅 publicInterconnectNetmask 非空时返回。
     */
    public InternetIpPrice publicInterconnectIpPrice;

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

    public PriceItem getInternetBandwidthPrice() {
        return this.internetBandwidthPrice;
    }

    public void setInternetBandwidthPrice(PriceItem internetBandwidthPrice) {
        this.internetBandwidthPrice = internetBandwidthPrice;
    }

    public List<InternetIpPrice> getPublicIpPrices() {
        return this.publicIpPrices;
    }

    public void setPublicIpPrices(List<InternetIpPrice> publicIpPrices) {
        this.publicIpPrices = publicIpPrices;
    }

    public InternetIpPrice getPublicInterconnectIpPrice() {
        return this.publicInterconnectIpPrice;
    }

    public void setPublicInterconnectIpPrice(InternetIpPrice publicInterconnectIpPrice) {
        this.publicInterconnectIpPrice = publicInterconnectIpPrice;
    }

}