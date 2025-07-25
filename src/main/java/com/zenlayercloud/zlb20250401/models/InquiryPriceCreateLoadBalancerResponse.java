package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述创建负载均衡实例的响应。
 */
public class InquiryPriceCreateLoadBalancerResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 负载均衡实例的价格
     */
    public PriceItem loadBalancerInstancePrice;

    /**
     * 弹性IP的价格
     */
    public PriceItem eipPrice;

    /**
     * 弹性IP的网络计费的价格
     */
    public PriceItem eipNetworkPrice;

    /**
     * 负载均衡实例LCU的价格
     */
    public PriceItem lcuPrice;

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

    public PriceItem getLcuPrice() {
        return this.lcuPrice;
    }

    public void setLcuPrice(PriceItem lcuPrice) {
        this.lcuPrice = lcuPrice;
    }

}