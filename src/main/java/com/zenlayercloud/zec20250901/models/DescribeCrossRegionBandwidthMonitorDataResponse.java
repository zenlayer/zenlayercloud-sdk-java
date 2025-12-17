package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询内网跨区域带宽监控指标数据响应。
 */
public class DescribeCrossRegionBandwidthMonitorDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 入方向最大值
     */
    public Double inMaxValue;

    /**
     * 入方向平均值
     */
    public Double inAvgValue;

    /**
     * 入方向最小值
     */
    public Double inMinValue;

    /**
     * 入方向总和值
     */
    public Double inTotalValue;

    /**
     * 出方向最大值
     */
    public Double outMaxValue;

    /**
     * 出方向平均值
     */
    public Double outAvgValue;

    /**
     * 出方向最小值
     */
    public Double outMinValue;

    /**
     * 出方向总和值
     */
    public Double outTotalValue;

    /**
     * 监控数据集合
     */
    public List<CrossRegionBandwidthMetricValue> dataList;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getInMaxValue() {
        return this.inMaxValue;
    }

    public void setInMaxValue(Double inMaxValue) {
        this.inMaxValue = inMaxValue;
    }

    public Double getInAvgValue() {
        return this.inAvgValue;
    }

    public void setInAvgValue(Double inAvgValue) {
        this.inAvgValue = inAvgValue;
    }

    public Double getInMinValue() {
        return this.inMinValue;
    }

    public void setInMinValue(Double inMinValue) {
        this.inMinValue = inMinValue;
    }

    public Double getInTotalValue() {
        return this.inTotalValue;
    }

    public void setInTotalValue(Double inTotalValue) {
        this.inTotalValue = inTotalValue;
    }

    public Double getOutMaxValue() {
        return this.outMaxValue;
    }

    public void setOutMaxValue(Double outMaxValue) {
        this.outMaxValue = outMaxValue;
    }

    public Double getOutAvgValue() {
        return this.outAvgValue;
    }

    public void setOutAvgValue(Double outAvgValue) {
        this.outAvgValue = outAvgValue;
    }

    public Double getOutMinValue() {
        return this.outMinValue;
    }

    public void setOutMinValue(Double outMinValue) {
        this.outMinValue = outMinValue;
    }

    public Double getOutTotalValue() {
        return this.outTotalValue;
    }

    public void setOutTotalValue(Double outTotalValue) {
        this.outTotalValue = outTotalValue;
    }

    public List<CrossRegionBandwidthMetricValue> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<CrossRegionBandwidthMetricValue> dataList) {
        this.dataList = dataList;
    }

}