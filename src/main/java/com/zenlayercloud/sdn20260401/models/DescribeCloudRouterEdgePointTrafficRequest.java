package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeCloudRouterEdgePointTrafficRequest extends TeaModel {


    /**
     * 三层网络连接点的 ID。
     */
    public String edgePointId;

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

    public String getEdgePointId() {
        return this.edgePointId;
    }

    public void setEdgePointId(String edgePointId) {
        this.edgePointId = edgePointId;
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