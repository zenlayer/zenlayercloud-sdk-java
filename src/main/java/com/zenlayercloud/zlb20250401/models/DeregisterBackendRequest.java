package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeregisterBackendRequest extends TeaModel {


    /**
     * 负载均衡实例 ID
     */
    public String loadBalancerId;

    /**
     * 负载均衡监听器 ID
     */
    public String listenerId;

    /**
     * 要删除的后端服务器列表
     */
    public List<BackendServer> backendServers;

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

    public List<BackendServer> getBackendServers() {
        return this.backendServers;
    }

    public void setBackendServers(List<BackendServer> backendServers) {
        this.backendServers = backendServers;
    }

}