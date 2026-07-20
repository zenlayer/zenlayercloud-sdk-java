package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePrivateConnectAvailablePortsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据中心端口总数量。
     */
    public Integer totalCount;

    /**
     * 可加入网络的数据中心端口列表。
     */
    public List<PortInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PortInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<PortInfo> dataSet) {
        this.dataSet = dataSet;
    }

}