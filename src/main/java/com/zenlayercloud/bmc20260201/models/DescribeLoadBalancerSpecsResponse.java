package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeLoadBalancerSpecsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 规格集合。
     */
    public List<LoadBalancerSpec> specSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<LoadBalancerSpec> getSpecSet() {
        return this.specSet;
    }

    public void setSpecSet(List<LoadBalancerSpec> specSet) {
        this.specSet = specSet;
    }

}