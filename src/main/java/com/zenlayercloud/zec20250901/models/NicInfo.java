package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述网卡的相关信息。
 */
public class NicInfo extends TeaModel {


    /**
     * 网卡的ID
     */
    public String nicId;

    /**
     * 网卡的名称
     */
    public String name;

    /**
     * 网卡状态
     */
    public String status;

    /**
     * 网卡类型
     */
    public String nicType;

    /**
     * 所属节点ID
     */
    public String regionId;

    /**
     * 网卡的IP堆栈类型
     */
    public String nicSubnetType;

    /**
     * 关联的公网IP
     */
    public List<String> publicIpList;

    /**
     * 关联的内网IP
     */
    public List<String> privateIpList;

    /**
     * 主的内网IPv4地址
     */
    public String primaryIpv4;

    /**
     * 网卡上的主IPv6地址。
     * 如果堆栈类型是V4,该值取值为空
     */
    public String primaryIpv6;

    /**
     * 网卡上的IPv6地址。
     * 如果堆栈类型是V4,该值取值为空
     */
    public String ipv6Cidr;

    /**
     * 网卡上的辅助 IPv4 地址
     */
    public List<String> secondaryIpv4s;

    /**
     * 网卡的MAC地址
     */
    public String macAddress;

    /**
     * 所绑定的实例ID
     */
    public String instanceId;

    /**
     * 所关联VPC ID
     */
    public String vpcId;

    /**
     * 所关联的子网ID
     */
    public String subnetId;

    /**
     * 网卡的创建时间
     */
    public String createTime;

    /**
     * 网卡的更新时间
     */
    public String updateTime;

    /**
     * 网卡所属的资源组信息
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 网卡关联的安全组ID
     */
    public String securityGroupId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNicType() {
        return this.nicType;
    }

    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getNicSubnetType() {
        return this.nicSubnetType;
    }

    public void setNicSubnetType(String nicSubnetType) {
        this.nicSubnetType = nicSubnetType;
    }

    public List<String> getPublicIpList() {
        return this.publicIpList;
    }

    public void setPublicIpList(List<String> publicIpList) {
        this.publicIpList = publicIpList;
    }

    public List<String> getPrivateIpList() {
        return this.privateIpList;
    }

    public void setPrivateIpList(List<String> privateIpList) {
        this.privateIpList = privateIpList;
    }

    public String getPrimaryIpv4() {
        return this.primaryIpv4;
    }

    public void setPrimaryIpv4(String primaryIpv4) {
        this.primaryIpv4 = primaryIpv4;
    }

    public String getPrimaryIpv6() {
        return this.primaryIpv6;
    }

    public void setPrimaryIpv6(String primaryIpv6) {
        this.primaryIpv6 = primaryIpv6;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    public List<String> getSecondaryIpv4s() {
        return this.secondaryIpv4s;
    }

    public void setSecondaryIpv4s(List<String> secondaryIpv4s) {
        this.secondaryIpv4s = secondaryIpv4s;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
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

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}