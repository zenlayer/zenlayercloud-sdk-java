package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyLoadBalancersNameRequest extends TeaModel {


    /**
     * 负载均衡名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String loadBalancerName;

    /**
     * 负载均衡ID集合。
     */
    public List<String> loadBalancerIds;

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

}