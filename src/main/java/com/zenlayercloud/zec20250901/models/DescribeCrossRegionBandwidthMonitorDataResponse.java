package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCrossRegionBandwidthMonitorDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 入方向最大值。
     */
    public Double inMaxValue;

    /**
     * 入方向平均值。
     */
    public Double inAvgValue;

    /**
     * 入方向最小值。
     */
    public Double inMinValue;

    /**
     * 入方向总和值。
     */
    public Double inTotalValue;

    /**
     * 出方向最大值。
     */
    public Double outMaxValue;

    /**
     * 出方向平均值。
     */
    public Double outAvgValue;

    /**
     * 出方向最小值。
     */
    public Double outMinValue;

    /**
     * 出方向总和值。
     */
    public Double outTotalValue;

    /**
     * 入方向丢弃量最大值。
     */
    public Double loseInMaxValue;

    /**
     * 入方向丢弃量最小值。
     */
    public Double loseInMinValue;

    /**
     * 入方向丢弃量总和值。
     */
    public Double loseInTotalValue;

    /**
     * 出方向丢弃量最大值。
     */
    public Double loseOutMaxValue;

    /**
     * 出方向丢弃量最小值。
     */
    public Double loseOutMinValue;

    /**
     * 出方向丢弃量总和值。
     */
    public Double loseOutTotalValue;

    /**
     * 监控数据集合。
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

    public Double getLoseInMaxValue() {
        return this.loseInMaxValue;
    }

    public void setLoseInMaxValue(Double loseInMaxValue) {
        this.loseInMaxValue = loseInMaxValue;
    }

    public Double getLoseInMinValue() {
        return this.loseInMinValue;
    }

    public void setLoseInMinValue(Double loseInMinValue) {
        this.loseInMinValue = loseInMinValue;
    }

    public Double getLoseInTotalValue() {
        return this.loseInTotalValue;
    }

    public void setLoseInTotalValue(Double loseInTotalValue) {
        this.loseInTotalValue = loseInTotalValue;
    }

    public Double getLoseOutMaxValue() {
        return this.loseOutMaxValue;
    }

    public void setLoseOutMaxValue(Double loseOutMaxValue) {
        this.loseOutMaxValue = loseOutMaxValue;
    }

    public Double getLoseOutMinValue() {
        return this.loseOutMinValue;
    }

    public void setLoseOutMinValue(Double loseOutMinValue) {
        this.loseOutMinValue = loseOutMinValue;
    }

    public Double getLoseOutTotalValue() {
        return this.loseOutTotalValue;
    }

    public void setLoseOutTotalValue(Double loseOutTotalValue) {
        this.loseOutTotalValue = loseOutTotalValue;
    }

    public List<CrossRegionBandwidthMetricValue> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<CrossRegionBandwidthMetricValue> dataList) {
        this.dataList = dataList;
    }

}