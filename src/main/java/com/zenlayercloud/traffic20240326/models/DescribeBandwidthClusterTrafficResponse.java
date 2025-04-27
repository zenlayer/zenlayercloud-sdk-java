package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBandwidthClusterTrafficResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 带宽数据列表
     */
    public List<BandwidthClusterTrafficData> dataList;

    /**
     * 入口带宽95值
     */
    public Long in95;

    /**
     * 入口带宽95值时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String in95Time;

    /**
     * 入口带宽平均值
     */
    public Long inAvg;

    /**
     * 入口带宽最大值
     */
    public Long inMax;

    /**
     * 入口带宽最小值
     */
    public Long inMin;

    /**
     * 入口带宽总流量
     */
    public Long inTotal;

    /**
     * 出口带宽95值
     */
    public Long out95;

    /**
     * 出口带宽95值时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String out95Time;

    /**
     * 出口带宽平均值
     */
    public Long outAvg;

    /**
     * 出口带宽最大值
     */
    public Long outMax;

    /**
     * 出口带宽最小值
     */
    public Long outMin;

    /**
     * 出口带宽总流量
     */
    public Long outTotal;

    /**
     * 最大带宽95值。
     * 单位：Mbps
     */
    public Double maxBandwidth95ValueMbps;

    /**
     * 总流量单位。
     * 例如：B
     */
    public String totalUnit;

    /**
     * 带宽值单位。
     * 例如：bps
     */
    public String unit;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<BandwidthClusterTrafficData> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<BandwidthClusterTrafficData> dataList) {
        this.dataList = dataList;
    }

    public Long getIn95() {
        return this.in95;
    }

    public void setIn95(Long in95) {
        this.in95 = in95;
    }

    public String getIn95Time() {
        return this.in95Time;
    }

    public void setIn95Time(String in95Time) {
        this.in95Time = in95Time;
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

    public String getOut95Time() {
        return this.out95Time;
    }

    public void setOut95Time(String out95Time) {
        this.out95Time = out95Time;
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

    public Double getMaxBandwidth95ValueMbps() {
        return this.maxBandwidth95ValueMbps;
    }

    public void setMaxBandwidth95ValueMbps(Double maxBandwidth95ValueMbps) {
        this.maxBandwidth95ValueMbps = maxBandwidth95ValueMbps;
    }

    public String getTotalUnit() {
        return this.totalUnit;
    }

    public void setTotalUnit(String totalUnit) {
        this.totalUnit = totalUnit;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}