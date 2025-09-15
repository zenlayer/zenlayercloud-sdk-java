package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网IPv6的基本信息。
 */
public class PublicIpv6CidrAddress extends TeaModel {


    /**
     * IPv6 CIDR的ID
     */
    public String ipv6CidrId;

    /**
     * IPv6 CIDR的地址
     */
    public String ipv6Cidr;

    /**
     * 网卡的主IPv6地址
     */
    public String primaryIpv6Address;

    /**
     * IPv6的网络计费类型
     */
    public String internetChargeType;

    /**
     * IPv6的公网带宽限速。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * IPv6的流量包大小。
     * 单位：TB
     */
    public Double trafficPackageSize;

    /**
     * 关联的带宽组信息
     */
    public BandwidthClusterInfo bandwidthCluster;

    public String getIpv6CidrId() {
        return this.ipv6CidrId;
    }

    public void setIpv6CidrId(String ipv6CidrId) {
        this.ipv6CidrId = ipv6CidrId;
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

}