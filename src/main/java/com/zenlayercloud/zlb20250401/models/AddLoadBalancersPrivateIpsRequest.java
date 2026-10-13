package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AddLoadBalancersPrivateIpsRequest extends TeaModel {


    /**
     * 要加入的内网IP。
     * 单次最多20个。
     * 需在`subnetId`对应子网的CIDR范围内，且未被其它资源占用。
     */
    public List<String> privateIps;

    /**
     * 负载均衡ID。
     * 可通过调用 ~~DescribeLoadBalancers~~ 获取。
     */
    public String loadBalancerId;

    /**
     * 作为内网IP所在的子网ID。
     * 可以通过调用 ~~zec:DescribeSubnets~~ 获取。
     * 该子网所属的区域和VPC需与负载均衡实例一致。
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