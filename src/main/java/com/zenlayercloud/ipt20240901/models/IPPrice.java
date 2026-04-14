package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * IP价格信息。
 */
public class IPPrice extends TeaModel {


    /**
     * IP CIDR 的价格信息。
     */
    public PriceItem price;

    /**
     * IP CIDR 的网段。
     */
    public Integer netmask;

    /**
     * IP CIDR 的数量。
     */
    public Integer qty;

    public PriceItem getPrice() {
        return this.price;
    }

    public void setPrice(PriceItem price) {
        this.price = price;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public Integer getQty() {
        return this.qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

}