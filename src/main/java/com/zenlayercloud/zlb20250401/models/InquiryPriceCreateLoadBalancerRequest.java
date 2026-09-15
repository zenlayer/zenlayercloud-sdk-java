package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateLoadBalancerRequest extends TeaModel {


    /**
     * 区域节点ID。
     */
    public String regionId;

    /**
     * IP堆栈类型。
     * 负载均衡实例只支持单栈，即`IPv4`或`IPv6`，不支持双栈。
     * 指定为`IPv6`时不支持配置公网网络参数（`internetChargeType`、`networkLineType`、`bandwidthMbps`、`trafficPackageSize`、`bandwidthClusterId`）——IPv6负载均衡的公网地址通过`AssignLoadBalancerIpv6`接口单独分配。
     */
    public String ipStackType;

    /**
     * IP网络计费模式。
     * **使用已有EIP创建负载均衡时请勿传本参数**——不传表示本次不新建EIP，询价结果中不含EIP相关费用；传了则按新建EIP计价，会多算一份EIP费用。
     */
    public String internetChargeType;

    /**
     * IP 的网络类型。
     * 已废弃，请使用`networkLineType`。
     */
    @Deprecated
    public String ipNetworkType;

    /**
     * IP 的网络类型。
     */
    public String networkLineType;

    /**
     * EIP的最大出带宽。单位为Mbps。最大限制通常为10000，如果有额外要求，请联系Support。当`internetChargeType`为`ByBandwidth`时，此参数必填。
     */
    public Integer bandwidthMbps;

    /**
     * 流量包大小。
     * 指定此参数时，IP网络计费模式(`internetChargeType`) 需为`ByTrafficPackage`, 否则该参数不生效。
     * 仅当计费周期为月时支持设置，小时计费不支持。
     */
    public Double trafficPackageSize;

    /**
     * 共享带宽包ID。
     * 指定此参数时，IP网络计费模式(`internetChargeType`) 需为`BandwidthCluster`, 否则该参数不生效。
     */
    public String bandwidthClusterId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getIpStackType() {
        return this.ipStackType;
    }

    public void setIpStackType(String ipStackType) {
        this.ipStackType = ipStackType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    @Deprecated
    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    @Deprecated
    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
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