package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstancesMonitorHealthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 硬件状态信息列表。
     */
    public List<InstanceHealth> monitorHealthList;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceHealth> getMonitorHealthList() {
        return this.monitorHealthList;
    }

    public void setMonitorHealthList(List<InstanceHealth> monitorHealthList) {
        this.monitorHealthList = monitorHealthList;
    }

}