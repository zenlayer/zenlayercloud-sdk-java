package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询时区的响应结果。
 */
public class DescribeTimeZonesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 所有的时区
     */
    public List<String> timeZones;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getTimeZones() {
        return this.timeZones;
    }

    public void setTimeZones(List<String> timeZones) {
        this.timeZones = timeZones;
    }

}