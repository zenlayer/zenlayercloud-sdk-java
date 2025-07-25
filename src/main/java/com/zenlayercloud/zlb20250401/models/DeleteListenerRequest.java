package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class DeleteListenerRequest extends TeaModel {


    /**
     * 负载均衡实例ID
     */
    public String loadBalancerId;

    /**
     * 监听器ID
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