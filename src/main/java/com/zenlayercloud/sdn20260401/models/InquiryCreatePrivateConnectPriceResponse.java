package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryCreatePrivateConnectPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 二层网络专线带宽价格。
     */
    public PriceItem privateConnectPrice;

    /**
     * 二层网络专线带宽。
     */
    public Integer privateConnectBandwidth;

    /**
     * A 端连接点的建设价格。
     */
    public PriceItem endpointAPrice;

    /**
     * A 端连接点带宽。
     */
    public Integer endpointABandwidth;

    /**
     * Z 端连接点的建设价格。
     */
    public PriceItem endpointZPrice;

    /**
     * Z 端连接点带宽。
     */
    public Integer endpointZBandwidth;

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

    public PriceItem getEndpointAPrice() {
        return this.endpointAPrice;
    }

    public void setEndpointAPrice(PriceItem endpointAPrice) {
        this.endpointAPrice = endpointAPrice;
    }

    public Integer getEndpointABandwidth() {
        return this.endpointABandwidth;
    }

    public void setEndpointABandwidth(Integer endpointABandwidth) {
        this.endpointABandwidth = endpointABandwidth;
    }

    public PriceItem getEndpointZPrice() {
        return this.endpointZPrice;
    }

    public void setEndpointZPrice(PriceItem endpointZPrice) {
        this.endpointZPrice = endpointZPrice;
    }

    public Integer getEndpointZBandwidth() {
        return this.endpointZBandwidth;
    }

    public void setEndpointZBandwidth(Integer endpointZBandwidth) {
        this.endpointZBandwidth = endpointZBandwidth;
    }

}