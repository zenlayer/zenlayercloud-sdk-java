package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeIPTransitTrafficResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 带宽数据列表。
     */
    public List<TrafficData> dataList;

    /**
     * 入口带宽95值。
     */
    public Long in95;

    /**
     * 入口带宽平均值。
     */
    public Long inAvg;

    /**
     * 入口带宽最大值。
     */
    public Long inMax;

    /**
     * 入口带宽最小值。
     */
    public Long inMin;

    /**
     * 出口带宽95值。
     */
    public Long out95;

    /**
     * 出口带宽平均值。
     */
    public Long outAvg;

    /**
     * 出口带宽最大值。
     */
    public Long outMax;

    /**
     * 出口带宽最小值。
     */
    public Long outMin;

    /**
     * 带宽值单位。例如：bps。
     */
    public String unit;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<TrafficData> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<TrafficData> dataList) {
        this.dataList = dataList;
    }

    public Long getIn95() {
        return this.in95;
    }

    public void setIn95(Long in95) {
        this.in95 = in95;
    }

    public Long getInAvg() {
        return this.inAvg;
    }

    public void setInAvg(Long inAvg) {
        this.inAvg = inAvg;
    }

    public Long getInMax() {
        return this.inMax;
    }

    public void setInMax(Long inMax) {
        this.inMax = inMax;
    }

    public Long getInMin() {
        return this.inMin;
    }

    public void setInMin(Long inMin) {
        this.inMin = inMin;
    }

    public Long getOut95() {
        return this.out95;
    }

    public void setOut95(Long out95) {
        this.out95 = out95;
    }

    public Long getOutAvg() {
        return this.outAvg;
    }

    public void setOutAvg(Long outAvg) {
        this.outAvg = outAvg;
    }

    public Long getOutMax() {
        return this.outMax;
    }

    public void setOutMax(Long outMax) {
        this.outMax = outMax;
    }

    public Long getOutMin() {
        return this.outMin;
    }

    public void setOutMin(Long outMin) {
        this.outMin = outMin;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}