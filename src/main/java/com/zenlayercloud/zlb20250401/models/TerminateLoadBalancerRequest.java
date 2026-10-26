package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class TerminateLoadBalancerRequest extends TeaModel {


    /**
     * 负载均衡实例ID。
     * 可通过调用 **DescribeLoadBalancers** 获取。
     */
    public String loadBalancerId;

    /**
     * 需要随实例一同释放的EIP ID列表。
     * 可通过调用 **DescribeEips** 并指定`associatedId`为该负载均衡实例ID获取。
     * 仅释放已绑定在该实例上的非默认EIP，其余ID将被忽略。
     * 不指定时不释放任何EIP。
     */
    public List<String> eipIds;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

}