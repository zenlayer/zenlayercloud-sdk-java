package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class DescribeBackendHealthRequest extends TeaModel {


    /**
     * 负载均衡实例 ID
     */
    public String loadBalancerId;

    /**
     * 负载均衡监听器的 ID。
     * 如果未指定，则查询所有后端
     */
    public String listenerId;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

}