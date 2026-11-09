package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryModifyInternetPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 专线（VLL）价格。
     * BANDWIDTH 类型时可能有值，基于 Router 的 Internet 为空。
     */
    public PriceItem privateConnectPrice;

    /**
     * 专线带宽（Mbps）。
     * BANDWIDTH 类型时有值。
     */
    public Integer privateConnectBandwidth;

    /**
     * Internet 带宽价格。
     */
    public PriceItem internetPrice;

    /**
     * 公网 CIDR 块价格列表。
     * ADD_CIDR_BLOCK、EXPAND_CIDR_BLOCK 类型时有值。
     */
    public List<InternetIpPriceItem> internetIpPrices;

    /**
     * 公网互联块价格。
     * 启用公网互联时填充，否则为空。
     */
    public InternetIpPriceItem publicInterconnectIpPrice;

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

    public Integer getPrivateConnectBandwidth() {
        return this.privateConnectBandwidth;
    }

    public void setPrivateConnectBandwidth(Integer privateConnectBandwidth) {
        this.privateConnectBandwidth = privateConnectBandwidth;
    }

    public PriceItem getInternetPrice() {
        return this.internetPrice;
    }

    public void setInternetPrice(PriceItem internetPrice) {
        this.internetPrice = internetPrice;
    }

    public List<InternetIpPriceItem> getInternetIpPrices() {
        return this.internetIpPrices;
    }

    public void setInternetIpPrices(List<InternetIpPriceItem> internetIpPrices) {
        this.internetIpPrices = internetIpPrices;
    }

    public InternetIpPriceItem getPublicInterconnectIpPrice() {
        return this.publicInterconnectIpPrice;
    }

    public void setPublicInterconnectIpPrice(InternetIpPriceItem publicInterconnectIpPrice) {
        this.publicInterconnectIpPrice = publicInterconnectIpPrice;
    }

}