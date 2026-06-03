package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class BandwidthPriceResponseItem extends TeaModel {


    /**
     * 流量方向类型。
     * LOCAL：境内；INTERNATIONAL：境外；ALL：全部方向。
     */
    public String trafficType;

    /**
     * 该方向的带宽价格。
     */
    public PriceItem price;

    public String getTrafficType() {
        return this.trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

}