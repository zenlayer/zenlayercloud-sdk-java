package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePrivateConnectTrafficRequest extends TeaModel {


    /**
     * 二层网络专线 ID。
     */
    public String privateConnectId;

    /**
     * 查询开始时间。
     * ISO8601 UTC 格式：YYYY-MM-DDThh:mm:ssZ。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * ISO8601 UTC 格式：YYYY-MM-DDThh:mm:ssZ，默认为当前时间。
     */
    public String endTime;

    /**
     * 数据采样周期。
     * 单位为秒，可选值：20、40、60、120、300、900。
     */
    public Integer period;

    /**
     * 采样周期内流量数据的统计方式。
     */
    public String statistic;

    public String getPrivateConnectId() {
        return this.privateConnectId;
    }

    public void setPrivateConnectId(String privateConnectId) {
        this.privateConnectId = privateConnectId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getStatistic() {
        return this.statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

}