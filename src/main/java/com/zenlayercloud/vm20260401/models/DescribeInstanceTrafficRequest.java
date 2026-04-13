package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceTrafficRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 查询开始时间。
     * ISO8601标准，UTC时间。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * ISO8601标准，UTC时间。
     */
    public String endTime;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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