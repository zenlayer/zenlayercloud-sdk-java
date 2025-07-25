package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class RegisterBackendRequest extends TeaModel {


    /**
     * 负载均衡实例的 ID
     */
    public String loadBalancerId;

    /**
     * 负载均衡监听器的 ID
     */
    public String listenerId;

    /**
     * 要绑定的后端服务器列表。
     * 注意：同一个实例在同一个监听器里只能存在一个
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