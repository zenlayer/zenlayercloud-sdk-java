package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更前各计费项当前生效的价格。
 */
public class Ipv6PreviousPrices extends TeaModel {


    /**
     * 变更前公网IPv6的保留价格。
     */
    public PriceItem ipv6Price;

    /**
     * 变更前公网IPv6的带宽价格。
     */
    public PriceItem bandwidthPrice;

    public PriceItem getIpv6Price() {
        return this.ipv6Price;
    }

    public void setIpv6Price(PriceItem ipv6Price) {
        this.ipv6Price = ipv6Price;
    }

    public PriceItem getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(PriceItem bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

}