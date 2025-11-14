package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询云硬盘监控数据的响应信息。
 */
public class DescribeDiskMonitorDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 数据点的最大值
     */
    public Double maxValue;

    /**
     * 数据点的最小值
     */
    public Double minValue;

    /**
     * 数据点的平均值
     */
    public Double avgValue;

    /**
     * 监控数据集合
     */
    public List<MetricValue> metrics;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMinValue() {
        return this.minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getAvgValue() {
        return this.avgValue;
    }

    public void setAvgValue(Double avgValue) {
        this.avgValue = avgValue;
    }

    public List<MetricValue> getMetrics() {
        return this.metrics;
    }

    public void setMetrics(List<MetricValue> metrics) {
        this.metrics = metrics;
    }

}