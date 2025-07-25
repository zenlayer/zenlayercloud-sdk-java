package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateLoadBalancerResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 下单编号
     */
    public String orderNumber;

    /**
     * 由负载均衡实例唯一 ID 组成的集合
     */
    public List<String> loadBalancerIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

}