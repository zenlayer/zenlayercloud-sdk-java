package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 托管实例查询结果。
 */
public class DescribeManagedInstancesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例数量
     */
    public Integer totalCount;

    /**
     * 实例列表
     */
    public List<ManagedInstanceInfo> dataSet;

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

    public List<ManagedInstanceInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<ManagedInstanceInfo> dataSet) {
        this.dataSet = dataSet;
    }

}