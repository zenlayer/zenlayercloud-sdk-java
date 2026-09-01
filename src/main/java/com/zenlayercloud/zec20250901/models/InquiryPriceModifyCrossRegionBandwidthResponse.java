package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyCrossRegionBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 内网跨区域带宽的价格。
     */
    public PriceItem crossRegionBandwidthPrice;

    /**
     * 变更前各计费项当前生效的价格，字段与上方一一对应，用于对比出哪些计费项发生了调价。
     * 无订单时为 null。
     */
    public CrossRegionBandwidthPreviousPrices previousPrices;

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

    public CrossRegionBandwidthPreviousPrices getPreviousPrices() {
        return this.previousPrices;
    }

    public void setPreviousPrices(CrossRegionBandwidthPreviousPrices previousPrices) {
        this.previousPrices = previousPrices;
    }

}