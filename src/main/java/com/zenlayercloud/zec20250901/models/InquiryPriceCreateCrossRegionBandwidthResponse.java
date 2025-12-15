package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 内网跨区域带宽的询价响应值。
 */
public class InquiryPriceCreateCrossRegionBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 内网跨区域带宽的价格
     */
    public PriceItem crossRegionBandwidthPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getCrossRegionBandwidthPrice() {
        return this.crossRegionBandwidthPrice;
    }

    public void setCrossRegionBandwidthPrice(PriceItem crossRegionBandwidthPrice) {
        this.crossRegionBandwidthPrice = crossRegionBandwidthPrice;
    }

}