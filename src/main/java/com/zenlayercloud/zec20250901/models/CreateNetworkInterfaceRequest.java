package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建辅助网卡的请求参数。
 */
public class CreateNetworkInterfaceRequest extends TeaModel {


    /**
     * 网卡名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    /**
     * 子网的ID
     */
    public String subnetId;

    /**
     * 网卡的IP堆栈类型。
     * 如果不指定，会根据子网堆栈类型决定：如果子网是V4,则网卡为V4，如果子网是V6,则网卡为V6。
     * 如果网卡要V4&V6，请指定该参数
     */
    public String nicStackType;

    /**
     * 网卡创建所在的资源组ID，如不指定则放入默认资源组
     */
    public String resourceGroupId;

    /**
     * 指定安全组ID。
     * 目前一个网卡只能关联1个安全组。
     * 如果未指定，会默认用VPC关联下的安全组
     */
    public String securityGroupId;

    /**
     * 公网IPv6的网络计费方式。
     * 当子网的堆栈类型包括V6且为公网时，需要指定
     */
    public String internetChargeType;

    /**
     * 公网IPv6的带宽限速。
     * 单位Mbps。
     * 当子网的堆栈类型包括V6且为公网时，需要指定
     */
    public Integer bandwidth;

    /**
     * 公网IPv6的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是流量计费(`ByTrafficPackage`)需要指定
     */
    public Double packageSize;

    /**
     * 公网IPv6所指定的共享带宽包ID。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是共享带宽包计费(`BandwidthCluster`)需要指定
     */
    public String clusterId;

    /**
     * 市场营销相关的选项
     */
    public MarketingInfo marketingOptions;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getNicStackType() {
        return this.nicStackType;
    }

    public void setNicStackType(String nicStackType) {
        this.nicStackType = nicStackType;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
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

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

}