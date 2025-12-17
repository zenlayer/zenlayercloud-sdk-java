package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class SetSecurityGroupForLoadBalancersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 更换失败的负载均衡实例集合
     */
    public List<String> failedLoadBalancerIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedLoadBalancerIds() {
        return this.failedLoadBalancerIds;
    }

    public void setFailedLoadBalancerIds(List<String> failedLoadBalancerIds) {
        this.failedLoadBalancerIds = failedLoadBalancerIds;
    }

}