package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class CreateLoadBalancerRequest extends TeaModel {


    /**
     * 区域节点ID
     */
    public String regionId;

    /**
     * 负载均衡后端服务器所属的VPC网络 ID
     */
    public String vpcId;

    /**
     * 负载均衡实例名称。
     * 长度为1～64个字符
     */
    public String loadBalancerName;

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

    /**
     * 资源组ID。
     * 如果不指定，则会创建在默认资源组
     */
    public String resourceGroupId;

    /**
     * 创建负载均衡的个数
     */
    public Integer number;

    /**
     * marketingOptions
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建负载均衡时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}