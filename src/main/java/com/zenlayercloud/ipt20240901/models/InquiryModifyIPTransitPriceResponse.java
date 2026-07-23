package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryModifyIPTransitPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 专线（VLL）价格。
     * BANDWIDTH 类型时可能有值，Router RIPT 为空。
     */
    public PriceItem privateConnectPrice;

    /**
     * 专线带宽（Mbps）。
     * BANDWIDTH 类型时有值。
     */
    public Integer privateConnectBandwidth;

    /**
     * RIPT 带宽价格。
     */
    public PriceItem iptPrice;

    /**
     * 公网 CIDR 块价格列表。
     * ADD_CIDR_BLOCK、EXPAND_CIDR_BLOCK 类型时有值。
     */
    public List<IPTransitIpPriceItem> iptIpPrices;

    /**
     * 公网互联块价格。
     * 启用公网互联时填充，否则为空。
     */
    public IPTransitIpPriceItem publicInterconnectIpPrice;

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

    public PriceItem getIptPrice() {
        return this.iptPrice;
    }

    public void setIptPrice(PriceItem iptPrice) {
        this.iptPrice = iptPrice;
    }

    public List<IPTransitIpPriceItem> getIptIpPrices() {
        return this.iptIpPrices;
    }

    public void setIptIpPrices(List<IPTransitIpPriceItem> iptIpPrices) {
        this.iptIpPrices = iptIpPrices;
    }

    public IPTransitIpPriceItem getPublicInterconnectIpPrice() {
        return this.publicInterconnectIpPrice;
    }

    public void setPublicInterconnectIpPrice(IPTransitIpPriceItem publicInterconnectIpPrice) {
        this.publicInterconnectIpPrice = publicInterconnectIpPrice;
    }

}