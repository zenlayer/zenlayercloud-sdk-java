package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * IPv6 CIDR某个掩码档位下单条线路的可售信息。
 */
public class Ipv6CidrLineTypeInfo extends TeaModel {


    /**
     * IP线路类型。
     */
    public String networkLineType;

    /**
     * 该掩码、该线路当前可购买的CIDR数量。
     */
    public Integer stock;

    /**
     * 该掩码、该线路的单价信息。
     */
    public PriceItem price;

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

}