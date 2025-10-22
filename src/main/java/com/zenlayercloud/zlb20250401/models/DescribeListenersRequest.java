package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeListenersRequest extends TeaModel {


    /**
     * 负载均衡实例的ID
     */
    public String loadBalancerId;

    /**
     * 要查询的负载均衡监听器 ID列表
     */
    public List<String> listenerIds;

    /**
     * 要查询的监听器协议类型
     */
    public String protocol;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public List<String> getListenerIds() {
        return this.listenerIds;
    }

    public void setListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}