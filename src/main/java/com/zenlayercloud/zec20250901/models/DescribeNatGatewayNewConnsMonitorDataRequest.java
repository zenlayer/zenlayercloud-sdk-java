package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeNatGatewayNewConnsMonitorDataRequest extends TeaModel {


    /**
     * NAT网关ID。
     * 可通过调用 **DescribeNatGateways** 获取。
     */
    public String natGatewayId;

    /**
     * 新建连接数监控指标类型。
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
     * 支持参数：1,5,15,60,360,1440,10080。
     */
    public Integer step;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
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

}