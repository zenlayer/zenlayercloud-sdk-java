package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeCloudRouterDCToDCTrafficRequest extends TeaModel {


    /**
     * 三层网络的 ID。
     */
    public String cloudRouterId;

    /**
     * 源数据中心 ID。
     */
    public String sourceDcId;

    /**
     * 目的数据中心 ID。
     */
    public String destinationDcId;

    /**
     * 查询开始时间。
     * ISO8601 格式，UTC 时区。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * ISO8601 格式，UTC 时区，默认为当前时间。
     */
    public String endTime;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

    public String getSourceDcId() {
        return this.sourceDcId;
    }

    public void setSourceDcId(String sourceDcId) {
        this.sourceDcId = sourceDcId;
    }

    public String getDestinationDcId() {
        return this.destinationDcId;
    }

    public void setDestinationDcId(String destinationDcId) {
        this.destinationDcId = destinationDcId;
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