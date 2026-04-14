package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


public class DescribeIPTransitTrafficRequest extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddTHH:mm:ssZ。
     * 默认为当前时间。
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