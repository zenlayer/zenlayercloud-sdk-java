package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 变更前各计费项当前生效的价格。
 */
public class EipPreviousPrices extends TeaModel {


    /**
     * 变更前公网弹性IP的保留价格。
     */
    public PriceItem eipPrice;

    /**
     * 变更前公网弹性IP的带宽价格。
     * 与顶层同义：PathBasedBandwidthIP线路时为null，明细见`previousPrices.bandwidthPrices`。
     */
    public PriceItem bandwidthPrice;

    /**
     * 变更前各流量方向的带宽价格明细，与顶层`bandwidthPrices`按`trafficType`一一对应。
     */
    public List<BandwidthPriceResponseItem> bandwidthPrices;

    /**
     * 变更前Remote IPT的带宽价格。
     * EIP未开启Remote IPT时为null。
     */
    public PriceItem remoteBandwidthPrice;

    public PriceItem getEipPrice() {
        return this.eipPrice;
    }

    public void setEipPrice(PriceItem eipPrice) {
        this.eipPrice = eipPrice;
    }

    public PriceItem getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(PriceItem bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

    public List<BandwidthPriceResponseItem> getBandwidthPrices() {
        return this.bandwidthPrices;
    }

    public void setBandwidthPrices(List<BandwidthPriceResponseItem> bandwidthPrices) {
        this.bandwidthPrices = bandwidthPrices;
    }

    public PriceItem getRemoteBandwidthPrice() {
        return this.remoteBandwidthPrice;
    }

    public void setRemoteBandwidthPrice(PriceItem remoteBandwidthPrice) {
        this.remoteBandwidthPrice = remoteBandwidthPrice;
    }

}