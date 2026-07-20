package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述数据中心端口的价格信息。
 */
public class DatacenterPortPrice extends TeaModel {


    /**
     * 交叉连接价格。
     * 如果当前数据中心不支持Zenlayer协助建设交叉连接，则该值为null。
     */
    public PriceItem crossConnectPrice;

    /**
     * 交叉连接一次性建设费。
     * 如果当前数据中心不支持Zenlayer协助建设交叉连接，则该值为null。
     */
    public PriceItem crossConnectOneTimeConstructionPrice;

    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 价格信息。
     */
    public PriceItem price;

    /**
     * 可用库存数量。
     */
    public Integer stock;

    public PriceItem getCrossConnectPrice() {
        return this.crossConnectPrice;
    }

    public void setCrossConnectPrice(PriceItem crossConnectPrice) {
        this.crossConnectPrice = crossConnectPrice;
    }

    public PriceItem getCrossConnectOneTimeConstructionPrice() {
        return this.crossConnectOneTimeConstructionPrice;
    }

    public void setCrossConnectOneTimeConstructionPrice(PriceItem crossConnectOneTimeConstructionPrice) {
        this.crossConnectOneTimeConstructionPrice = crossConnectOneTimeConstructionPrice;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
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