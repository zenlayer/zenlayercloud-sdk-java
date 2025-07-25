package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class DescribeLoadBalancerMonitorDataRequest extends TeaModel {


    /**
     * 负载均衡实例 ID
     */
    public String loadBalancerId;

    /**
     * 负载均衡器的监听器ID。
     * 公网IP数据包指标（`INGRESS_PACKETS`, `EGRESS_PACKETS`) 该字段无效
     */
    public String listenerId;

    /**
     * 监控指标类型
     */
    public String metricType;

    /**
     * 查询开始时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ
     */
    public String endTime;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
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

}