package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * IP 价格信息。
 */
public class IPPrice extends TeaModel {


    /**
     * 价格详情。
     */
    public PriceItem price;

    /**
     * 掩码长度。
     */
    public Integer netmask;

    /**
     * 数量。
     */
    public Integer qty;

    /**
     * IP 网络类型。
     */
    public String ipNetworkType;

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

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

}