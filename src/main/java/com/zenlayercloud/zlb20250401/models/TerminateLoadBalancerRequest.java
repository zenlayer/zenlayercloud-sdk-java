package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class TerminateLoadBalancerRequest extends TeaModel {


    /**
     * 负载均衡实例 ID
     */
    public String loadBalancerId;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

}