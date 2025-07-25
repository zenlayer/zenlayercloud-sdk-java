package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyLoadBalancersAttributeRequest extends TeaModel {


    /**
     * 负载均衡实例ID列表
     */
    public List<String> loadBalancerIds;

    /**
     * 负载均衡实例的名称
     */
    public String loadBalancerName;

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

}