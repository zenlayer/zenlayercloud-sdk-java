package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class UnbindSecurityGroupFromLoadBalancersRequest extends TeaModel {


    /**
     * 要解绑安全组的负载均衡ID集合
     */
    public List<String> loadBalancerIds;

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

}