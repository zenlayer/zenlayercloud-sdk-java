package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询公网弹性IP的价格的响应结果。
 */
public class DescribeEipPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 公网弹性IP的保留价格。
     * 如果是通过cidr创建，则保留价格为null
     */
    public PriceItem eipPrice;

    /**
     * 公网弹性IP的带宽价格
     */
    public PriceItem bandwidthPrice;

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

}