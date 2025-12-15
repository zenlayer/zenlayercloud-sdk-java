package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 恢复内网跨区域带宽请求参数。
 */
public class RenewCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 要恢复的内网跨区域带宽ID
     */
    public String crossRegionBandwidthId;

    public String getCrossRegionBandwidthId() {
        return this.crossRegionBandwidthId;
    }

    public void setCrossRegionBandwidthId(String crossRegionBandwidthId) {
        this.crossRegionBandwidthId = crossRegionBandwidthId;
    }

}