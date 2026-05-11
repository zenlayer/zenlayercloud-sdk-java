package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeUnmanagedEgressIpsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的非托管出口IP总数。
     */
    public Integer totalCount;

    /**
     * 返回的非托管出口IP列表。
     */
    public List<UnmanagedEgressIpInfo> dataSet;

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

    public List<UnmanagedEgressIpInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<UnmanagedEgressIpInfo> dataSet) {
        this.dataSet = dataSet;
    }

}