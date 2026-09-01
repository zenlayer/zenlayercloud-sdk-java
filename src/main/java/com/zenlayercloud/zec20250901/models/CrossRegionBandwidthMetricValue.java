package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述内网跨区域带宽的监控指标数据。
 */
public class CrossRegionBandwidthMetricValue extends TeaModel {


    /**
     * 数据点时间。
     */
    public String time;

    /**
     * 入方向值。
     */
    public Double inValue;

    /**
     * 入方向丢弃值。
     */
    public Double loseInValue;

    /**
     * 出方向值。
     */
    public Double outValue;

    /**
     * 出方向丢弃值。
     */
    public Double loseOutValue;

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getInValue() {
        return this.inValue;
    }

    public void setInValue(Double inValue) {
        this.inValue = inValue;
    }

    public Double getLoseInValue() {
        return this.loseInValue;
    }

    public void setLoseInValue(Double loseInValue) {
        this.loseInValue = loseInValue;
    }

    public Double getOutValue() {
        return this.outValue;
    }

    public void setOutValue(Double outValue) {
        this.outValue = outValue;
    }

    public Double getLoseOutValue() {
        return this.loseOutValue;
    }

    public void setLoseOutValue(Double loseOutValue) {
        this.loseOutValue = loseOutValue;
    }

}