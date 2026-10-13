package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeEipNewConnsMonitorDataRequest extends TeaModel {


    /**
     * EIP唯一标识ID。
     * 网络类型为PathBasedBandwidthIP的EIP不支持查询此指标，返回错误。
     * 与 instanceId 二选一。
     */
    public String eipId;

    /**
     * 实例ID。
     * 查询该实例绑定的所有IPv4 EIP的聚合数据（不含IPv6，且排除PathBasedBandwidthIP类型）。
     * 与 eipId 二选一。
     */
    public String instanceId;

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
     * 取值为1时，查询时间跨度不能超过6小时。
     */
    public Integer step;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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