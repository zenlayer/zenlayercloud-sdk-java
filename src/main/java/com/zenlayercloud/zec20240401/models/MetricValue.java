package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述实例监控指标的数据值。
 */
public class MetricValue extends TeaModel {


    /**
     * 数据点时间
     */
    public String time;

    /**
     * 数据点的值
     */
    public Double value;

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}