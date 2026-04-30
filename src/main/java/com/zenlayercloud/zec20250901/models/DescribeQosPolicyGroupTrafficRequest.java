package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DescribeQosPolicyGroupTrafficRequest extends TeaModel {


    /**
     * QoS策略组ID。
     */
    public String qosPolicyGroupId;

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
     * 数据粒度，单位秒。
     * 支持的值：60、300、600、3600。
     */
    public Integer period;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
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

}