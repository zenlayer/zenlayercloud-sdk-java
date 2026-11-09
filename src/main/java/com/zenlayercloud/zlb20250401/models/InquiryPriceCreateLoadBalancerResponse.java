package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryPriceCreateLoadBalancerResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 负载均衡实例的价格。
     */
    public PriceItem loadBalancerInstancePrice;

    /**
     * 弹性IP的价格。
     */
    public PriceItem eipPrice;

    /**
     * 弹性IP的网络计费的价格。
     */
    public PriceItem eipNetworkPrice;

    /**
     * 各流量方向的带宽价格明细。
     * PathBasedBandwidthIP线路返回多项（eipNetworkPrice为null）；其他线路返回单项（trafficType=ALL）。
     */
    public List<BandwidthPriceResponseItem> eipNetworkPrices;

    /**
     * 负载均衡实例LCU的价格。
     */
    public PriceItem lcuPrice;

    /**
     * 公网IPv6网段的价格。
     * 仅`ipStackType`为`IPv6`且指定了`internetChargeType`时返回，公网IPv6网段免费，价格恒为0。
     */
    public PriceItem ipv6Price;

    /**
     * 公网IPv6的网络计费的价格。
     * 仅`ipStackType`为`IPv6`且指定了`internetChargeType`时返回；共享带宽包计费(`BandwidthCluster`)时为空。
     */
    public PriceItem ipv6NetworkPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getLoadBalancerInstancePrice() {
        return this.loadBalancerInstancePrice;
    }

    public void setLoadBalancerInstancePrice(PriceItem loadBalancerInstancePrice) {
        this.loadBalancerInstancePrice = loadBalancerInstancePrice;
    }

    public PriceItem getEipPrice() {
        return this.eipPrice;
    }

    public void setEipPrice(PriceItem eipPrice) {
        this.eipPrice = eipPrice;
    }

    public PriceItem getEipNetworkPrice() {
        return this.eipNetworkPrice;
    }

    public void setEipNetworkPrice(PriceItem eipNetworkPrice) {
        this.eipNetworkPrice = eipNetworkPrice;
    }

    public List<BandwidthPriceResponseItem> getEipNetworkPrices() {
        return this.eipNetworkPrices;
    }

    public void setEipNetworkPrices(List<BandwidthPriceResponseItem> eipNetworkPrices) {
        this.eipNetworkPrices = eipNetworkPrices;
    }

    public PriceItem getLcuPrice() {
        return this.lcuPrice;
    }

    public void setLcuPrice(PriceItem lcuPrice) {
        this.lcuPrice = lcuPrice;
    }

    public PriceItem getIpv6Price() {
        return this.ipv6Price;
    }

    public void setIpv6Price(PriceItem ipv6Price) {
        this.ipv6Price = ipv6Price;
    }

    public PriceItem getIpv6NetworkPrice() {
        return this.ipv6NetworkPrice;
    }

    public void setIpv6NetworkPrice(PriceItem ipv6NetworkPrice) {
        this.ipv6NetworkPrice = ipv6NetworkPrice;
    }

}