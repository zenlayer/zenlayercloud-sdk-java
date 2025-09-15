package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述EIP的监控指标数据。
 */
public class EipMetricValue extends TeaModel {


    /**
     * 数据点时间
     */
    public String time;

    /**
     * 入方向值
     */
    public Double inValue;

    /**
     * 入方向值
     */
    public Double outValue;

    /**
     * 丢失入方向值
     */
    public Double loseIn;

    /**
     * 丢失出方向值
     */
    public Double loseOut;

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

    public Double getOutValue() {
        return this.outValue;
    }

    public void setOutValue(Double outValue) {
        this.outValue = outValue;
    }

    public Double getLoseIn() {
        return this.loseIn;
    }

    public void setLoseIn(Double loseIn) {
        this.loseIn = loseIn;
    }

    public Double getLoseOut() {
        return this.loseOut;
    }

    public void setLoseOut(Double loseOut) {
        this.loseOut = loseOut;
    }

}