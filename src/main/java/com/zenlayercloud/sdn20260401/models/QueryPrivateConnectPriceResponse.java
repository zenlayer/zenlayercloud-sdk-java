package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryPrivateConnectPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 二层网络专线A端连接点价格信息。
     */
    public PrivateConnectEndpointPrice endpointAPrice;

    /**
     * 二层网络专线Z端连接点价格信息。
     */
    public PrivateConnectEndpointPrice endpointZPrice;

    /**
     * 价格信息。
     */
    public PriceItem price;

    /**
     * 可用库存数量。
     */
    public Integer stock;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PrivateConnectEndpointPrice getEndpointAPrice() {
        return this.endpointAPrice;
    }

    public void setEndpointAPrice(PrivateConnectEndpointPrice endpointAPrice) {
        this.endpointAPrice = endpointAPrice;
    }

    public PrivateConnectEndpointPrice getEndpointZPrice() {
        return this.endpointZPrice;
    }

    public void setEndpointZPrice(PrivateConnectEndpointPrice endpointZPrice) {
        this.endpointZPrice = endpointZPrice;
    }

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}