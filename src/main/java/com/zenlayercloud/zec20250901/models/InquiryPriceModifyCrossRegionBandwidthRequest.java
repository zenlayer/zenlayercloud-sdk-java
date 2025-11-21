package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改内网跨区域带宽询价请求参数
 */
public class InquiryPriceModifyCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 要修改的内网跨区域带宽ID
     */
    public String crossRegionBandwidthId;

    /**
     * 带宽|保底带宽。
     * 单位：Mbps
     */
    public Integer bandwidth;

    public String getCrossRegionBandwidthId() {
        return this.crossRegionBandwidthId;
    }

    public void setCrossRegionBandwidthId(String crossRegionBandwidthId) {
        this.crossRegionBandwidthId = crossRegionBandwidthId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

}