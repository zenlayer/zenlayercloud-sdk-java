package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCloudRouterDCToDCTrafficResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 流量明细数据列表。
     */
    public List<TrafficData> dataList;

    /**
     * 入方向 95 峰值流量。
     */
    public Long in95;

    /**
     * 入方向平均流量。
     */
    public Long inAvg;

    /**
     * 入方向最大流量。
     */
    public Long inMax;

    /**
     * 入方向最小流量。
     */
    public Long inMin;

    /**
     * 出方向 95 峰值流量。
     */
    public Long out95;

    /**
     * 出方向平均流量。
     */
    public Long outAvg;

    /**
     * 出方向最大流量。
     */
    public Long outMax;

    /**
     * 出方向最小流量。
     */
    public Long outMin;

    /**
     * 流量单位。
     * 如 bps。
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