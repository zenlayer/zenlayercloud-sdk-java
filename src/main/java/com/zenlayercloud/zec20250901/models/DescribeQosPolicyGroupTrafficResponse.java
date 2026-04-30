package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeQosPolicyGroupTrafficResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 流量监控数据点列表。
     */
    public List<TrafficDataPoint> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<TrafficDataPoint> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<TrafficDataPoint> dataSet) {
        this.dataSet = dataSet;
    }

}