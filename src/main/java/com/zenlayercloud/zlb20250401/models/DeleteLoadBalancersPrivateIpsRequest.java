package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteLoadBalancersPrivateIpsRequest extends TeaModel {


    /**
     * 要删除的内网IP集合
     */
    public List<String> privateIps;

    /**
     * 负载均衡ID
     */
    public String loadBalancerId;

    public List<String> getPrivateIps() {
        return this.privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

}