package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 云硬盘性能信息。
 */
public class DiskPerfItem extends TeaModel {


    /**
     * 未开启突发时的最大 IOPS。
     */
    public Integer maxIops;

    /**
     * 未开启突发时的最大带宽，单位：MB/s。
     */
    public Integer maxBandwidth;

    /**
     * 开启突发后的 IOPS。
     */
    public Integer iopsBurst;

    /**
     * 开启突发后的带宽，单位：MB/s。
     */
    public Integer bandwidthBurst;

    public Integer getMaxIops() {
        return this.maxIops;
    }

    public void setMaxIops(Integer maxIops) {
        this.maxIops = maxIops;
    }

    public Integer getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public Integer getIopsBurst() {
        return this.iopsBurst;
    }

    public void setIopsBurst(Integer iopsBurst) {
        this.iopsBurst = iopsBurst;
    }

    public Integer getBandwidthBurst() {
        return this.bandwidthBurst;
    }

    public void setBandwidthBurst(Integer bandwidthBurst) {
        this.bandwidthBurst = bandwidthBurst;
    }

}