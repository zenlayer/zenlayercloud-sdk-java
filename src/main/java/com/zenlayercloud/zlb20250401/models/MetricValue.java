package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述监控指标的数据值。
 */
public class MetricValue extends TeaModel {


    /**
     * 数据点时间
     */
    public String time;

    /**
     * 数据点的值。
     * 如果该值为null,表示取不到相应的值
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