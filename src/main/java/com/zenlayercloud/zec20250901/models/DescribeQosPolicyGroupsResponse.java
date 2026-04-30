package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeQosPolicyGroupsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * QoS策略组结果集。
     */
    public List<QosPolicyGroup> dataSet;

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

    public List<QosPolicyGroup> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<QosPolicyGroup> dataSet) {
        this.dataSet = dataSet;
    }

}