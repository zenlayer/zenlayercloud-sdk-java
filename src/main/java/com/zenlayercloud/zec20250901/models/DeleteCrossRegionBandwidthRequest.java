package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 要删除的VPC跨区域带宽ID。
     * 可通过调用 ~~DescribeCrossRegionBandwidth~~ 获取。
     */
    public String crossRegionBandwidthId;

    public String getCrossRegionBandwidthId() {
        return this.crossRegionBandwidthId;
    }

    public void setCrossRegionBandwidthId(String crossRegionBandwidthId) {
        this.crossRegionBandwidthId = crossRegionBandwidthId;
    }

}