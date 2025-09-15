package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询弹性公网IP指定时间段内的流量信息的响应值。
 */
public class DescribeEipTrafficResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 查询的数据点
     */
    public List<EipTrafficData> dataList;

    /**
     * 入方向带宽95值。
     * 单位：bps
     */
    public Long in95;

    /**
     * 入方向带宽平均值。
     * 单位：bps
     */
    public Long inAvg;

    /**
     * 入方向带宽的最大值。
     * 单位：bps
     */
    public Long inMax;

    /**
     * 入方向带宽的最小值。
     * 单位：bps
     */
    public Long inMin;

    /**
     * 入方向的总字节。
     * 单位：Byte
     */
    public Long inTotal;

    /**
     * 出方向带宽95值。
     * 单位：bps
     */
    public Long out95;

    /**
     * 出方向带宽平均值。
     * 单位：bps
     */
    public Long outAvg;

    /**
     * 出方向带宽最大值。
     * 单位：bps
     */
    public Long outMax;

    /**
     * 出方向带宽最小值。
     * 单位：bps
     */
    public Long outMin;

    /**
     * 入方向的总字节。
     * 单位：bps
     */
    public Long outTotal;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<EipTrafficData> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<EipTrafficData> dataList) {
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

    public Long getInTotal() {
        return this.inTotal;
    }

    public void setInTotal(Long inTotal) {
        this.inTotal = inTotal;
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

    public Long getOutTotal() {
        return this.outTotal;
    }

    public void setOutTotal(Long outTotal) {
        this.outTotal = outTotal;
    }

}