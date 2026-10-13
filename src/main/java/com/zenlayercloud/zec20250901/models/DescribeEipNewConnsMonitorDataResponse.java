package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeEipNewConnsMonitorDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * All（入+出之和）数据点的最大值。
     */
    public Double allMaxValue;

    /**
     * All（入+出之和）数据点的最小值。
     */
    public Double allMinValue;

    /**
     * All（入+出之和）数据点的平均值。
     */
    public Double allAvgValue;

    /**
     * In（入方向）数据点的最大值。
     */
    public Double inMaxValue;

    /**
     * In（入方向）数据点的最小值。
     */
    public Double inMinValue;

    /**
     * In（入方向）数据点的平均值。
     */
    public Double inAvgValue;

    /**
     * Out（出方向）数据点的最大值。
     */
    public Double outMaxValue;

    /**
     * Out（出方向）数据点的最小值。
     */
    public Double outMinValue;

    /**
     * Out（出方向）数据点的平均值。
     */
    public Double outAvgValue;

    /**
     * 监控数据集合。
     */
    public List<NewConnsValue> dataList;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getAllMaxValue() {
        return this.allMaxValue;
    }

    public void setAllMaxValue(Double allMaxValue) {
        this.allMaxValue = allMaxValue;
    }

    public Double getAllMinValue() {
        return this.allMinValue;
    }

    public void setAllMinValue(Double allMinValue) {
        this.allMinValue = allMinValue;
    }

    public Double getAllAvgValue() {
        return this.allAvgValue;
    }

    public void setAllAvgValue(Double allAvgValue) {
        this.allAvgValue = allAvgValue;
    }

    public Double getInMaxValue() {
        return this.inMaxValue;
    }

    public void setInMaxValue(Double inMaxValue) {
        this.inMaxValue = inMaxValue;
    }

    public Double getInMinValue() {
        return this.inMinValue;
    }

    public void setInMinValue(Double inMinValue) {
        this.inMinValue = inMinValue;
    }

    public Double getInAvgValue() {
        return this.inAvgValue;
    }

    public void setInAvgValue(Double inAvgValue) {
        this.inAvgValue = inAvgValue;
    }

    public Double getOutMaxValue() {
        return this.outMaxValue;
    }

    public void setOutMaxValue(Double outMaxValue) {
        this.outMaxValue = outMaxValue;
    }

    public Double getOutMinValue() {
        return this.outMinValue;
    }

    public void setOutMinValue(Double outMinValue) {
        this.outMinValue = outMinValue;
    }

    public Double getOutAvgValue() {
        return this.outAvgValue;
    }

    public void setOutAvgValue(Double outAvgValue) {
        this.outAvgValue = outAvgValue;
    }

    public List<NewConnsValue> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<NewConnsValue> dataList) {
        this.dataList = dataList;
    }

}