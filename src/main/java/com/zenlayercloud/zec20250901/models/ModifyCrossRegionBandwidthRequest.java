package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 调整内网跨区域带宽请求参数
 */
public class ModifyCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 要调整的内网跨区域带宽ID
     */
    public String crossRegionBandwidthId;

    /**
     * 带宽|保底带宽。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * 突发带宽。
     * 单位：Mbps
     */
    public Integer bandwidthCap;

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

    public Integer getBandwidthCap() {
        return this.bandwidthCap;
    }

    public void setBandwidthCap(Integer bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }

}