package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询实例状态
 */
public class DescribeInstancesStatusResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 实例状态数据
     */
    public List<InstanceStatus> dataSet;

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

    public List<InstanceStatus> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<InstanceStatus> dataSet) {
        this.dataSet = dataSet;
    }

}