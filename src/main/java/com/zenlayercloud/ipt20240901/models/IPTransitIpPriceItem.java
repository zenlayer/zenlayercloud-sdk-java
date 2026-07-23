package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * CIDR 块价格信息。
 */
public class IPTransitIpPriceItem extends TeaModel {


    /**
     * 价格信息。
     */
    public PriceItem price;

    /**
     * CIDR 掩码长度。
     */
    public Integer netmask;

    /**
     * 数量。
     */
    public Integer amount;

    /**
     * IP 网络类型（BGP_IP / LOCAL_IP）。
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

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

}