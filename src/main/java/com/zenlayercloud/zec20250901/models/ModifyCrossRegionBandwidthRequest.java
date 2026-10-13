package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 要调整的VPC跨区域带宽ID。
     * 可通过调用 ~~DescribeCrossRegionBandwidth~~ 获取。
     */
    public String crossRegionBandwidthId;

    /**
     * 带宽|保底带宽。
     * 单位：Mbps。
     * 计费类型为`ByBandwidth`时必须与原带宽不同；计费类型为`ByInstanceBandwidth95`时，本参数与`bandwidthCap`至少修改其中之一。
     */
    public Integer bandwidth;

    /**
     * 突发带宽。
     * 单位：Mbps。
     * 仅计费类型为`ByInstanceBandwidth95`时有效，不指定时保持不变。
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