package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeLoadBalancersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的LB总数量。
     */
    public Integer totalCount;

    /**
     * LoadBalancer集合。
     */
    public List<LoadBalancerInfo> dataSet;

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

    public List<LoadBalancerInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<LoadBalancerInfo> dataSet) {
        this.dataSet = dataSet;
    }

}