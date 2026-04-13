package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 实例相关信息。
 */
public class InstanceInfo extends TeaModel {


    /**
     * 实例唯一ID。
     */
    public String instanceId;

    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 实例显示名称。
     */
    public String instanceName;

    /**
     * 实例的主机名。
     */
    public String hostname;

    /**
     * 实例机型ID。
     */
    public String instanceTypeId;

    /**
     * 实例机型配置信息。
     */
    public InstanceType instanceType;

    /**
     * 镜像ID。
     */
    public String imageId;

    /**
     * 镜像名称。
     */
    public String imageName;

    /**
     * IpxeUrl。
     */
    public String ipxeUrl;

    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。 POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 公网出口带宽。
     * 单位：Mbps。
     * 0 代表无限制，但是不会超过机型的最大上限。
     */
    public Integer bandwidthOutMbps;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 购买实例的时长。
     * 单位：月。
     * 后付费实例该字段为null。
     */
    public Integer period;

    /**
     * 实例的母IP。
     */
    public String primaryPublicIpAddress;

    /**
     * 实例的主IPv6地址。
     */
    public String primaryPublicIPv6Address;

    /**
     * 实例公网IPv4列表。
     * 如果机器的主IP未加入到公网组网接口，那么主IP将无法使用，且该字段也不会返回该IP。
     */
    public List<String> publicIpAddresses;

    /**
     * 实例内网IP列表。
     */
    public List<String> privateIpAddresses;

    /**
     * 实例的IPv6地址。
     * 注意：此字段可能返回null，表示取不到有效值。
     */
    public List<String> ipv6Addresses;

    /**
     * 实例所属的内网组网ID列表。
     */
    public List<String> subnetIds;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String expiredTime;

    /**
     * 实例所属资源组的ID。
     */
    public String resourceGroupId;

    /**
     * 实例所属资源组的名称。
     */
    public String resourceGroupName;

    /**
     * 实例状态。
     * 状态类型详见实例状态。
     */
    public String instanceStatus;

    /**
     * 流量包订购大小。
     * 单位为TB。
     */
    public Double trafficPackageSize;

    /**
     * 磁盘阵列配置。
     */
    public RaidConfig raidConfig;

    /**
     * 分区配置。
     */
    public List<Partition> partitions;

    /**
     * 网卡配置。
     */
    public Nic nic;

    /**
     * 是否自动续费。
     * 对于预付费实例，取消订阅后，该字段值将返回 false
     */
    public Boolean autoRenew;

    /**
     * 安装的SSH密钥ID。
     */
    public String keyId;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    /**
     * 网关模式是否开启。
     */
    public Boolean enableGatewayMode;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public InstanceType getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getIpxeUrl() {
        return this.ipxeUrl;
    }

    public void setIpxeUrl(String ipxeUrl) {
        this.ipxeUrl = ipxeUrl;
    }

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public Integer getBandwidthOutMbps() {
        return this.bandwidthOutMbps;
    }

    public void setBandwidthOutMbps(Integer bandwidthOutMbps) {
        this.bandwidthOutMbps = bandwidthOutMbps;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getPrimaryPublicIpAddress() {
        return this.primaryPublicIpAddress;
    }

    public void setPrimaryPublicIpAddress(String primaryPublicIpAddress) {
        this.primaryPublicIpAddress = primaryPublicIpAddress;
    }

    public String getPrimaryPublicIPv6Address() {
        return this.primaryPublicIPv6Address;
    }

    public void setPrimaryPublicIPv6Address(String primaryPublicIPv6Address) {
        this.primaryPublicIPv6Address = primaryPublicIPv6Address;
    }

    public List<String> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<String> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }

    public List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public void setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public List<String> getIpv6Addresses() {
        return this.ipv6Addresses;
    }

    public void setIpv6Addresses(List<String> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
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

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public RaidConfig getRaidConfig() {
        return this.raidConfig;
    }

    public void setRaidConfig(RaidConfig raidConfig) {
        this.raidConfig = raidConfig;
    }

    public List<Partition> getPartitions() {
        return this.partitions;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

    public Nic getNic() {
        return this.nic;
    }

    public void setNic(Nic nic) {
        this.nic = nic;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Boolean getEnableGatewayMode() {
        return this.enableGatewayMode;
    }

    public void setEnableGatewayMode(Boolean enableGatewayMode) {
        this.enableGatewayMode = enableGatewayMode;
    }

}