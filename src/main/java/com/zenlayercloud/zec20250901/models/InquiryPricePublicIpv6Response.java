package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网Ipv6流量包或固定带宽询价的响应信息。
 */
public class InquiryPricePublicIpv6Response extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 带宽的价格
     */
    public PriceItem bandwidthPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(PriceItem bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

}