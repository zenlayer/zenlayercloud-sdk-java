package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateLoadBalancerVIPsRequest extends TeaModel {


    /**
     * 负载均衡的ID。
     */
    public String loadBalancerId;

    /**
     * 额外创建IP数量。
     */
    public Integer count;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}