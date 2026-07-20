package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述数据中心端口的类型、类别及价格信息。
 */
public class PortPrice extends TeaModel {


    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 数据中心端口规格。
     */
    public String portType;

    /**
     * 数据中心端口类别。
     */
    public String portCategory;

    /**
     * 数据中心端口价格信息。
     */
    public PriceItem portPrice;

    /**
     * 库存数量。
     */
    public Integer stock;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getPortType() {
        return this.portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getPortCategory() {
        return this.portCategory;
    }

    public void setPortCategory(String portCategory) {
        this.portCategory = portCategory;
    }

    public PriceItem getPortPrice() {
        return this.portPrice;
    }

    public void setPortPrice(PriceItem portPrice) {
        this.portPrice = portPrice;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}