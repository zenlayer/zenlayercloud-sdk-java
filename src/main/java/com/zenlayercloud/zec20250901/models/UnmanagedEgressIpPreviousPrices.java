package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更前各计费项当前生效的价格。
 */
public class UnmanagedEgressIpPreviousPrices extends TeaModel {


    /**
     * 变更前非托管出口IP的带宽价格。
     */
    public PriceItem bandwidthPrice;

    public PriceItem getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(PriceItem bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

}