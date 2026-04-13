package com.zenlayercloud.vm20260401.models;

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
     * 实例机型ID。
     */
    public String instanceType;

    /**
     * CPU核数，单位：核。
     */
    public Integer cpuCount;

    /**
     * 实例内存容量，单位：GiB。
     */
    public Integer memory;

    /**
     * 镜像ID。
     */
    public String imageId;

    /**
     * 镜像名称。
     */
    public String imageName;

    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 公网出口带宽，单位：Mbps。
     * 0代表无限制，但是不会超过机型的最大上限。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 购买实例的时长，单位：月。
     * 后付费实例该字段为null。
     */
    public Integer period;

    /**
     * 实例公网IPv4列表。
     * 如果机器的主IP未加入到公网组网接口，那么主IP将无法使用，且该字段也不会返回该IP。
     */
    public List<String> publicIpAddresses;

    /**
     * 实例公网IPv6列表。
     */
    public List<String> publicIpv6Addresses;

    /**
     * 实例内网IP列表。
     */
    public List<String> privateIpAddresses;

    /**
     * 实例所属的内网子网ID。
     */
    public String subnetId;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
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
     */
    public String instanceStatus;

    /**
     * 流量包订购大小，单位为TB。
     */
    public Double trafficPackageSize;

    /**
     * 实例加入的安全组列表。
     */
    public List<String> securityGroupIds;

    /**
     * 实例系统盘信息。
     */
    public SystemDisk systemDisk;

    /**
     * 实例数据盘信息。
     */
    public List<DataDisk> dataDisks;

    /**
     * 是否自动续费。
     * 对于预付费实例，取消订阅后，该字段值将返回false。
     */
    public Boolean autoRenew;

    /**
     * 密钥ID。
     * 注意：此字段可能返回null，表示取不到有效值。
     */
    public String keyId;

    /**
     * 网卡配置。
     */
    public Nic nic;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

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

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    public Integer getMemory() {
        return this.memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
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

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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

    public List<String> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<String> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }

    public List<String> getPublicIpv6Addresses() {
        return this.publicIpv6Addresses;
    }

    public void setPublicIpv6Addresses(List<String> publicIpv6Addresses) {
        this.publicIpv6Addresses = publicIpv6Addresses;
    }

    public List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public void setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
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

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
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

    public Nic getNic() {
        return this.nic;
    }

    public void setNic(Nic nic) {
        this.nic = nic;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}