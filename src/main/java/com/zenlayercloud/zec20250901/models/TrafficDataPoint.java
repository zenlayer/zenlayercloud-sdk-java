package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 流量监控数据点。
 */
public class TrafficDataPoint extends TeaModel {


    /**
     * 数据点时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String timestamp;

    /**
     * 入向带宽，单位bps。
     */
    public Long bandwidthIn;

    /**
     * 出向带宽，单位bps。
     */
    public Long bandwidthOut;

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getBandwidthIn() {
        return this.bandwidthIn;
    }

    public void setBandwidthIn(Long bandwidthIn) {
        this.bandwidthIn = bandwidthIn;
    }

    public Long getBandwidthOut() {
        return this.bandwidthOut;
    }

    public void setBandwidthOut(Long bandwidthOut) {
        this.bandwidthOut = bandwidthOut;
    }

}