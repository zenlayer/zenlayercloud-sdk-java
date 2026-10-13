package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeCrossRegionBandwidthMonitorDataRequest extends TeaModel {


    /**
     * 要查询的VPC跨区域带宽ID。
     * 可通过调用 ~~DescribeCrossRegionBandwidth~~ 获取。
     */
    public String crossRegionBandwidthId;

    /**
     * VPC跨区域带宽监控指标类型。
     */
    public String metricType;

    /**
     * 查询开始时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String endTime;

    public String getCrossRegionBandwidthId() {
        return this.crossRegionBandwidthId;
    }

    public void setCrossRegionBandwidthId(String crossRegionBandwidthId) {
        this.crossRegionBandwidthId = crossRegionBandwidthId;
    }

    public String getMetricType() {
        return this.metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}