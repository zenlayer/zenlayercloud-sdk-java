package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述负载均衡实例的信息。
 */
public class LoadBalancer extends TeaModel {


    /**
     * 区域节点ID。
     */
    public String regionId;

    /**
     * 负载均衡器ID。
     */
    public String loadBalancerId;

    /**
     * 负载均衡期名称。
     */
    public String loadBalancerName;

    /**
     * 负载均衡后端服务器所属的VPC网络 ID。
     */
    public String vpcId;

    /**
     * 负载均衡实例所属的子网 ID。
     * 健康检查内网 IP 分配在该子网；`ipStackType`为`IPv6`时，公网 IPv6 网段也分配在该子网。
     * 创建时未指定子网的实例该字段为空。
     */
    public String subnetId;

    /**
     * IP堆栈类型。
     * 负载均衡实例只支持单栈，即`IPv4`或`IPv6`。
     */
    public String ipStackType;

    /**
     * 负载均衡实例的状态。
     */
    public String status;

    /**
     * 负载均衡实例的公网 VIP 列表。
     * `IPv4`类型返回单个地址（如`128.0.0.1`）；`IPv6`类型返回带掩码的网段（如`2001:db8::/96`），而非网段内的单个地址。
     */
    public List<String> publicIpAddress;

    /**
     * 负载均衡实例的内网 VIP 列表。
     */
    public List<String> privateIpAddress;

    /**
     * 负载均衡实例的健康检查内网IP列表。
     */
    public List<String> healthCheckPrivateIps;

    /**
     * 负载均衡器下监听器的数量。
     */
    public Long listenerCount;

    /**
     * 负载均衡器下所有监听器绑定的后端服务器数量之和。
     * 按后端服务器的内网IP统计，同一台服务器的多个内网IP分别计数。
     */
    public Integer backendServerCount;

    /**
     * 创建时间。
     * 按照ISO8601标准表示，并且使用UTC时间, 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * 关联的资源组信息。
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 该负载均衡器关联的标签。
     */
    public Tags tags;

    /**
     * 负载均衡实例绑定的安全组ID。
     */
    public String securityGroupId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getIpStackType() {
        return this.ipStackType;
    }

    public void setIpStackType(String ipStackType) {
        this.ipStackType = ipStackType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public void setPublicIpAddress(List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public List<String> getHealthCheckPrivateIps() {
        return this.healthCheckPrivateIps;
    }

    public void setHealthCheckPrivateIps(List<String> healthCheckPrivateIps) {
        this.healthCheckPrivateIps = healthCheckPrivateIps;
    }

    public Long getListenerCount() {
        return this.listenerCount;
    }

    public void setListenerCount(Long listenerCount) {
        this.listenerCount = listenerCount;
    }

    public Integer getBackendServerCount() {
        return this.backendServerCount;
    }

    public void setBackendServerCount(Integer backendServerCount) {
        this.backendServerCount = backendServerCount;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}