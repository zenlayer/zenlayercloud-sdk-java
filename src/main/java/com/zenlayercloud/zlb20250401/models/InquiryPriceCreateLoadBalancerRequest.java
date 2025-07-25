package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateLoadBalancerRequest extends TeaModel {


    /**
     * 区域节点ID
     */
    public String regionId;

    /**
     * IP网络计费模式
     */
    public String internetChargeType;

    /**
     * IP 的网络类型
     */
    public String ipNetworkType;

    /**
     * EIP的最大出带宽。
     * 单位为Mbps。
     * 最大限制通常为10000，如果有额外要求， 请联系Support
     */
    public Integer bandwidthMbps;

    /**
     * 流量包大小。
     * 指定此参数时，IP网络计费模式(`internetChargeType`) 需为`ByTrafficPackage`, 否则该参数不生效
     */
    public Double trafficPackageSize;

    /**
     * 共享带宽包ID。
     * 指定此参数时，IP网络计费模式(`internetChargeType`) 需为`BandwidthCluster`, 否则该参数不生效
     */
    public String bandwidthClusterId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

}