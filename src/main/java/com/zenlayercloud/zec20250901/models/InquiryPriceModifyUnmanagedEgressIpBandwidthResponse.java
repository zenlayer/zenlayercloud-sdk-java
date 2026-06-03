package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyUnmanagedEgressIpBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 非托管出口IP的带宽价格。
     * 变更为共享带宽包计费（BandwidthCluster）时为null（免费）。
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