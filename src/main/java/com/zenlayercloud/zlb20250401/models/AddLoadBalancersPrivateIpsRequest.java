package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AddLoadBalancersPrivateIpsRequest extends TeaModel {


    /**
     * 要加入的内网Ip
     */
    public List<String> privateIps;

    /**
     * 负载均衡ID
     */
    public String loadBalancerId;

    /**
     * 作为内网ip的subnetId。
     * 可以通过[DescribeSubnets](../../../compute/zec/vpc-network/describesubnets.md)接口获取
     */
    public String subnetId;

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

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}