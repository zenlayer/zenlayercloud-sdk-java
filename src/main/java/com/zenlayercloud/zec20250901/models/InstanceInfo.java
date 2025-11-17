package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述虚拟机实例的信息。包括规格，状态，网卡等。
 */
public class InstanceInfo extends TeaModel {


    /**
     * 实例唯一ID
     */
    public String instanceId;

    /**
     * 实例显示名称
     */
    public String instanceName;

    /**
     * 实例所属的可用区ID
     */
    public String zoneId;

    /**
     * CPU 规格。
     * 如果是GPU实例，该字段取值为null
     */
    public String instanceType;

    /**
     * CPU 核数。
     * 单位：个
     */
    public Integer cpu;

    /**
     * 内存容量。
     * 单位：GiB
     */
    public Integer memory;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 镜像名称
     */
    public String imageName;

    /**
     * 设置的系统时区信息
     */
    public String timeZone;

    /**
     * 网卡模式
     */
    public String nicNetworkType;

    /**
     * 实例状态
     */
    public String status;

    /**
     * 系统盘信息
     */
    public SystemDisk systemDisk;

    /**
     * 实例上挂在的数据盘信息
     */
    public List<DataDisk> dataDisks;

    /**
     * 实例上公网IPv4列表
     */
    public List<String> publicIpAddresses;

    /**
     * 实例上内网IP列表
     */
    public List<String> privateIpAddresses;

    /**
     * 安装的SSH密钥ID
     */
    public String keyId;

    /**
     * 实例主网卡关联的子网ID
     */
    public String subnetId;

    /**
     * 实例主网卡关联的安全组ID
     */
    public String securityGroupId;

    /**
     * 是否开启QGA Agent
     */
    public Boolean enableAgent;

    /**
     * 是否开启QGA 监控采集
     */
    public Boolean enableAgentMonitor;

    /**
     * 是否开启IP转发
     */
    public Boolean enableIpForward;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 到期时间
     */
    public String expiredTime;

    /**
     * 实例所属的资源组ID
     */
    public String resourceGroupId;

    /**
     * 实例所属的资源组名称
     */
    public String resourceGroupName;

    /**
     * 实例上绑定的网卡信息
     */
    public List<NicInfo> nics;

    /**
     * 实例关联的标签
     */
    public Tags tags;

    /**
     * 实例上绑定的负载均衡ID列表
     */
    public List<String> loadBalancerIds;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getCpu() {
        return this.cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
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

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getNicNetworkType() {
        return this.nicNetworkType;
    }

    public void setNicNetworkType(String nicNetworkType) {
        this.nicNetworkType = nicNetworkType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public void setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
    }

    public Boolean getEnableAgentMonitor() {
        return this.enableAgentMonitor;
    }

    public void setEnableAgentMonitor(Boolean enableAgentMonitor) {
        this.enableAgentMonitor = enableAgentMonitor;
    }

    public Boolean getEnableIpForward() {
        return this.enableIpForward;
    }

    public void setEnableIpForward(Boolean enableIpForward) {
        this.enableIpForward = enableIpForward;
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

    public List<NicInfo> getNics() {
        return this.nics;
    }

    public void setNics(List<NicInfo> nics) {
        this.nics = nics;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

}