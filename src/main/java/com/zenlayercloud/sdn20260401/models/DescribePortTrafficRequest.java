package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePortTrafficRequest extends TeaModel {


    /**
     * 数据中心端口 ID。
     */
    public String portId;

    /**
     * 查询开始时间。
     * ISO8601 标准 UTC 格式：YYYY-MM-DDThh:mm:ssZ。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * ISO8601 标准 UTC 格式：YYYY-MM-DDThh:mm:ssZ。
     */
    public String endTime;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
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