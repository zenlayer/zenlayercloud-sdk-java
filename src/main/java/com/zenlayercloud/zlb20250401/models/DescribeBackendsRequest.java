package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeBackendsRequest extends TeaModel {


    /**
     * 负载均衡实例ID。
     * 可通过调用 ~~DescribeLoadBalancers~~ 获取。
     */
    public String loadBalancerId;

    /**
     * 负载均衡监听器的ID。
     * 如果未指定，则查询所有后端。
     * 可通过调用 ~~DescribeListeners~~ 获取。
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