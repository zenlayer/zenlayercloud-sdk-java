package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeIPTransitTrafficRequest extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

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

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
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