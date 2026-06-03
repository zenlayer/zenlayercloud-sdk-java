package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeEipMonitorDataRequest extends TeaModel {


    /**
     * EIP唯一标识ID。
     */
    public String eipId;

    /**
     * EIP监控指标类型。
     */
    public String metricType;

    /**
     * 查询开始时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String endTime;

    /**
     * 查询数据点间隔。
     * 单位为分钟。
     * 支持参数：1,5。
     */
    public Integer step;

    /**
     * 流量方向。
     * 仅 PathBasedBandwidthIP 类型有效；不传则返回全部方向数据。
     */
    public String direction;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getMetricType() {
        return this.metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
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

    public Integer getStep() {
        return this.step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}