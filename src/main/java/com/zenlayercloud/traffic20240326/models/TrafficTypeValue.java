package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 分类型带宽值。
 */
public class TrafficTypeValue extends TeaModel {


    /**
     * 流量类型。
     * LOCAL：本地；INTERNATIONAL：国际。
     */
    public String trafficType;

    /**
     * 带宽值。
     * 单位：Mbps。
     */
    public Double value;

    public String getTrafficType() {
        return this.trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}