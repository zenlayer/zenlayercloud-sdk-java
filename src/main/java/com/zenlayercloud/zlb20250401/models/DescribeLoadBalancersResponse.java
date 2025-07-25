package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeLoadBalancersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的负载均衡实例总数
     */
    public Integer totalCount;

    /**
     * 返回的负载均衡实例列表
     */
    public List<LoadBalancer> dataSet;

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

    public List<LoadBalancer> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<LoadBalancer> dataSet) {
        this.dataSet = dataSet;
    }

}