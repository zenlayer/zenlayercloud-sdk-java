package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class TerminateLoadBalancerRequest extends TeaModel {


    /**
     * 负载均衡实例的ID。
     */
    public String loadBalancerId;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

}