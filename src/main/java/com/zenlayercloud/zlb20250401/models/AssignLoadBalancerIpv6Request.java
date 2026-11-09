package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AssignLoadBalancerIpv6Request extends TeaModel {


    /**
     * 要分配公网IPv6的负载均衡实例ID。
     * 仅`ipStackType`为`IPv6`的负载均衡实例可用。
     * 可通过调用 **DescribeLoadBalancers** 获取。
     */
    public String loadBalancerId;

    /**
     * 公网IPv6的来源子网ID。
     * 该子网须属于负载均衡实例所在的VPC、与负载均衡实例同区域，且含公网IPv6网段（内网IPv6不满足）。
     * 同一负载均衡实例的公网IPv6可分配自同一VPC下的多个子网。
     * 可通过调用 **zec:DescribeSubnets** 获取。
     */
    public String subnetId;

    /**
     * 本次分配的公网IPv6数量。
     * 子网剩余可用公网IPv6不足时将返回`INVALID_SUBNET_IPV6_INSUFFICIENT`。
     */
    public Integer vipCount;

    /**
     * 公网IPv6的网络计费方式。
     */
    public String internetChargeType;

    /**
     * 公网IPv6的带宽限速。
     * 单位Mbps。
     * 网络计费方式为固定带宽(`ByBandwidth`)时必填。
     */
    public Integer bandwidth;

    /**
     * 公网IPv6的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 网络计费方式为流量计费(`ByTrafficPackage`)时必填，且仅计费周期为月时支持设置。
     */
    public Double packageSize;

    /**
     * 公网IPv6所指定的共享带宽包ID。
     * 网络计费方式为共享带宽包计费(`BandwidthCluster`)时必填。
     */
    public String clusterId;

    /**
     * 限速模式。
     * 严格模式(`STRICT`)必须同时指定`bandwidth`，否则返回`INVALID_RATE_LIMIT_MODE_REQUIRES_BANDWIDTH`。
     */
    public String rateLimitMode;

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

    public Integer getVipCount() {
        return this.vipCount;
    }

    public void setVipCount(Integer vipCount) {
        this.vipCount = vipCount;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Double getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(Double packageSize) {
        this.packageSize = packageSize;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}