package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 带宽用量数据。
 */
public class BandwidthClusterUsageData extends TeaModel {


    /**
     * 时间。
     * 95计费时间为月（格式yyyy-MM）。
     * 日峰值计费时间为日（格式yyyy-MM-dd）。
     */
    public String time;

    /**
     * 带宽值。
     * 单位：Mbps。
     */
    public Double value;

    /**
     * 分类型带宽值列表。
     * 仅 PathBasedBandwidth 类型填充。
     */
    public List<TrafficTypeValue> typeValues;

    /**
     * 带宽详情列表。
     */
    public List<BandwidthClusterUsageDetail> details;

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

    public List<TrafficTypeValue> getTypeValues() {
        return this.typeValues;
    }

    public void setTypeValues(List<TrafficTypeValue> typeValues) {
        this.typeValues = typeValues;
    }

    public List<BandwidthClusterUsageDetail> getDetails() {
        return this.details;
    }

    public void setDetails(List<BandwidthClusterUsageDetail> details) {
        this.details = details;
    }

}