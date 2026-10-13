package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更前各计费项当前生效的价格。
 */
public class CrossRegionBandwidthPreviousPrices extends TeaModel {


    /**
     * 变更前VPC跨区域带宽的价格。
     */
    public PriceItem crossRegionBandwidthPrice;

    public PriceItem getCrossRegionBandwidthPrice() {
        return this.crossRegionBandwidthPrice;
    }

    public void setCrossRegionBandwidthPrice(PriceItem crossRegionBandwidthPrice) {
        this.crossRegionBandwidthPrice = crossRegionBandwidthPrice;
    }

}