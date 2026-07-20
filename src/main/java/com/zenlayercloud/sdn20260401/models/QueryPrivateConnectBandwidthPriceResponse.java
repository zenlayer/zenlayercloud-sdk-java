package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryPrivateConnectBandwidthPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

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