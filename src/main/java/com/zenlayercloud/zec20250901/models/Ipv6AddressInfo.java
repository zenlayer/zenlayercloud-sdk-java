package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网IPv6的基本信息，包括IPv6地址段、计费配置与归属关系。
 */
public class Ipv6AddressInfo extends TeaModel {


    /**
     * 公网 IPv6 的唯一 ID。
     */
    public String ipv6Id;

    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 公网 IPv6 的状态。
     */
    public String status;

    /**
     * 公网 IPv6 的地址段。
     */
    public String ipv6Cidr;

    /**
     * 主 IPv6 地址。
     */
    public String primaryIpv6Address;

    /**
     * 公网 IPv6 绑定的资源ID。
     * 可能为网卡ID或负载均衡ID。
     */
    public String associatedId;

    /**
     * 公网 IPv6 绑定的资源类型。
     */
    public String associatedType;

    /**
     * 公网 IPv6 绑定的网卡ID。
     * 当且仅当`associatedType`字段为`NIC`时有值。
     */
    public String nicId;

    /**
     * 公网 IPv6 绑定的实例ID。
     * 当且仅当`associatedType`字段为`NIC`且该网卡已绑定实例时有值。
     */
    public String instanceId;

    /**
     * 公网 IPv6 的网络计费方式。
     */
    public String internetChargeType;

    /**
     * 公网 IPv6 的带宽限速。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    /**
     * 限速模式。
     */
    public String rateLimitMode;

    /**
     * 公网 IPv6 的流量包大小。
     * 单位：TB。
     * 仅当网络计费方式为流量包计费时可取到值。
     */
    public Double trafficPackageSize;

    /**
     * 关联的带宽组信息。
     * 仅当网络计费方式为共享带宽包计费时可取到值。
     */
    public BandwidthClusterInfo bandwidthCluster;

    /**
     * 公网 IPv6 所属的资源组ID。
     */
    public String resourceGroupId;

    /**
     * 公网 IPv6 所属的资源组名称。
     */
    public String resourceGroupName;

    /**
     * 公网 IPv6 的创建时间。
     */
    public String createTime;

    /**
     * 公网 IPv6 的带宽、流量包操作状态。
     * 操作已完成时该字段为空。
     */
    public OperationInfo operationInfo;

    public String getIpv6Id() {
        return this.ipv6Id;
    }

    public void setIpv6Id(String ipv6Id) {
        this.ipv6Id = ipv6Id;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    public String getPrimaryIpv6Address() {
        return this.primaryIpv6Address;
    }

    public void setPrimaryIpv6Address(String primaryIpv6Address) {
        this.primaryIpv6Address = primaryIpv6Address;
    }

    public String getAssociatedId() {
        return this.associatedId;
    }

    public void setAssociatedId(String associatedId) {
        this.associatedId = associatedId;
    }

    public String getAssociatedType() {
        return this.associatedType;
    }

    public void setAssociatedType(String associatedType) {
        this.associatedType = associatedType;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public BandwidthClusterInfo getBandwidthCluster() {
        return this.bandwidthCluster;
    }

    public void setBandwidthCluster(BandwidthClusterInfo bandwidthCluster) {
        this.bandwidthCluster = bandwidthCluster;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public OperationInfo getOperationInfo() {
        return this.operationInfo;
    }

    public void setOperationInfo(OperationInfo operationInfo) {
        this.operationInfo = operationInfo;
    }

}