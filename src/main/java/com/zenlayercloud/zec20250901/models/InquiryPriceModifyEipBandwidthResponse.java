package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryPriceModifyEipBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 公网弹性IP的保留价格。
     * 通过CIDR创建的IP保留价格为null。
     */
    public PriceItem eipPrice;

    /**
     * 公网弹性IP的带宽价格。
     * PathBasedBandwidthIP线路时为null，详见`bandwidthPrices`。
     */
    public PriceItem bandwidthPrice;

    /**
     * 各流量方向的带宽价格明细。
     * PathBasedBandwidthIP线路返回多项；其他线路返回单项（trafficType=ALL）。
     */
    public List<BandwidthPriceResponseItem> bandwidthPrices;

    /**
     * Remote IPT的带宽价格。
     * EIP未开启Remote IPT时为null。
     */
    public PriceItem remoteBandwidthPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

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