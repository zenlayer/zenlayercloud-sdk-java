package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePrivateConnectTrafficRequest extends TeaModel {


    /**
     * 二层网络专线 ID。
     */
    public String privateConnectId;

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

    public String getPrivateConnectId() {
        return this.privateConnectId;
    }

    public void setPrivateConnectId(String privateConnectId) {
        this.privateConnectId = privateConnectId;
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