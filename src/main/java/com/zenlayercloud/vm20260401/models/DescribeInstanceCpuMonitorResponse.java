package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstanceCpuMonitorResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * CPU使用率列表。
     */
    public List<DescribeInstanceCpuMonitorData> dataList;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DescribeInstanceCpuMonitorData> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<DescribeInstanceCpuMonitorData> dataList) {
        this.dataList = dataList;
    }

}