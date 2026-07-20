package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述二层网络专线连接点的价格信息。
 */
public class PrivateConnectEndpointPrice extends TeaModel {


    /**
     * 交叉连接价格。
     * 连接点类型为数据中心端口并且该数据中心支持Zenlayer协助建设交叉连接时有值。
     */
    public PriceItem crossConnectPrice;

    /**
     * 交叉连接一次性建设费。
     * 连接点类型为数据中心端口并且该数据中心支持Zenlayer协助建设交叉连接时有值。
     */
    public PriceItem crossConnectOneTimeConstructionPrice;

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