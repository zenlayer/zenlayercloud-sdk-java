package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateInstancesRequest extends TeaModel {


    /**
     * 实例所在节点ID。
     */
    public String zoneId;

    /**
     * 指定有效的镜像ID。
     */
    public String imageId;

    /**
     * 实例机型。
     */
    public String instanceType;

    /**
     * 实例显示名称。
     */
    public String instanceName;

    /**
     * 实例的密码。
     */
    public String password;

    /**
     * 密钥ID。
     */
    public String keyId;

    /**
     * 实例所在的资源组ID。
     */
    public String resourceGroupId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid instanceChargePrepaid;

    /**
     * 后付费模式相关参数设置。
     */
    public ChargePostpaid instanceChargePostpaid;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 流量包订购大小，单位TB。
     */
    public Double trafficPackageSize;

    /**
     * 公网出带宽上限，单位Mbps。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 指定创建实例的数量。
     */
    public Integer instanceCount;

    /**
     * 实例系统盘配置信息。
     */
    public SystemDisk systemDisk;

    /**
     * 实例数据盘配置信息。
     */
    public List<DataDisk> dataDisks;

    /**
     * 私有网络子网ID。
     */
    public String subnetId;

    /**
     * 是否开启公网IPv6。
     */
    public Boolean enableIpv6;

    /**
     * 是否开启公网IPv4。
     */
    public Boolean enableIpv4;

    /**
     * 是否开启CPU穿透。
     */
    public Boolean cpuPassThrough;

    /**
     * 初始化脚本。
     */
    public String initScript;

    /**
     * 网卡模式。
     * Vf：物理直通模式。
     * Virtio：软件模拟模式。
     */
    public String networkMode;

    /**
     * 硬盘数据预分配。
     */
    public Boolean diskPreAllocated;

    /**
     * 网卡配置。
     */
    public Nic nic;

    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 带宽组ID。
     */
    public String clusterId;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建实例时关联的标签。
     * 注意：关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public ChargePrepaid getInstanceChargePrepaid() {
        return this.instanceChargePrepaid;
    }

    public void setInstanceChargePrepaid(ChargePrepaid instanceChargePrepaid) {
        this.instanceChargePrepaid = instanceChargePrepaid;
    }

    public ChargePostpaid getInstanceChargePostpaid() {
        return this.instanceChargePostpaid;
    }

    public void setInstanceChargePostpaid(ChargePostpaid instanceChargePostpaid) {
        this.instanceChargePostpaid = instanceChargePostpaid;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public void setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
    }

    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public void setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public void setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
    }

    public Boolean getEnableIpv4() {
        return this.enableIpv4;
    }

    public void setEnableIpv4(Boolean enableIpv4) {
        this.enableIpv4 = enableIpv4;
    }

    public Boolean getCpuPassThrough() {
        return this.cpuPassThrough;
    }

    public void setCpuPassThrough(Boolean cpuPassThrough) {
        this.cpuPassThrough = cpuPassThrough;
    }

    public String getInitScript() {
        return this.initScript;
    }

    public void setInitScript(String initScript) {
        this.initScript = initScript;
    }

    public String getNetworkMode() {
        return this.networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public Boolean getDiskPreAllocated() {
        return this.diskPreAllocated;
    }

    public void setDiskPreAllocated(Boolean diskPreAllocated) {
        this.diskPreAllocated = diskPreAllocated;
    }

    public Nic getNic() {
        return this.nic;
    }

    public void setNic(Nic nic) {
        this.nic = nic;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
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

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}