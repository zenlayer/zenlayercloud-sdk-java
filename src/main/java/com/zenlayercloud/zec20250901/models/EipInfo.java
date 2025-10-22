package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述公网弹性IP的基本信息，包括IPv4地址，IP绑定的关系。
 */
public class EipInfo extends TeaModel {


    /**
     * EIP 的唯一 ID
     */
    public String eipId;

    /**
     * EIP 的名称
     */
    public String name;

    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 对端节点ID。
     * 仅当IP为Remote IP时该字段有效
     */
    public String peerRegionId;

    /**
     * 是否是默认类型
     */
    public Boolean isDefault;

    /**
     * EIP 的状态
     */
    public String status;

    /**
     * 公网IP地址
     */
    public List<String> publicIpAddresses;

    /**
     * EIP 绑定的内网IP地址
     */
    public String privateIpAddress;

    /**
     * EIP 的类型
     */
    public String eipV4Type;

    /**
     * EIP 的网络计费方式
     */
    public String internetChargeType;

    /**
     * EIP 来自的CIDR地址段ID
     */
    public String cidrId;

    /**
     * EIP 关联的网卡ID。
     * 该字段已废弃，请使用 `associatedId` 字段
     */
    public String nicId;

    /**
     * EIP 绑定的资源ID。
     * 可能为负载均衡ID、网卡ID或者NAT网关ID
     */
    public String associatedId;

    /**
     * EIP 资源类型。
     * 可能为负载均衡ID、网卡ID或者NAT网关ID
     */
    public String associatedType;

    /**
     * EIP 绑定的实例ID。
     * 当且仅当`associatedType`字段为`NIC`时可能有值
     */
    public String instanceId;

    /**
     * EIP 绑定类型
     */
    public String bindType;

    /**
     * EIP 流量包大小。
     * 仅当网络计费方式为流量计费时可取到值。
     * 该字段可能为null
     */
    public Double flowPackage;

    /**
     * EIP 的带宽限速。
     * 单位为Mbps
     */
    public Integer bandwidth;

    /**
     * EIP 的地理位置信息
     */
    public List<EipGeoInfo> eipGeoRefs;

    /**
     * EIP的封堵阈值
     */
    public List<BlockInfo> blockInfoList;

    /**
     * EIP 的创建时间
     */
    public String createTime;

    /**
     * EIP 的到期时间。
     * 该字段可能为null
     */
    public String expiredTime;

    /**
     * EIP 关联的资源组ID
     */
    public String resourceGroupId;

    /**
     * EIP 关联的资源组名称
     */
    public String resourceGroupName;

    /**
     * EIP 关联的带宽组ID
     */
    public BandwidthClusterInfo bandwidthCluster;

    /**
     * EIP关联的标签
     */
    public Tags tags;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getPeerRegionId() {
        return this.peerRegionId;
    }

    public void setPeerRegionId(String peerRegionId) {
        this.peerRegionId = peerRegionId;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<String> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getAssociatedId() {
        return this.associatedId;
    }

    public void setAssociatedId(String associatedId) {
        this.associatedId = associatedId;
    }

    public String getAssociatedType() {
        return this.associatedType;
    }

    public void setAssociatedType(String associatedType) {
        this.associatedType = associatedType;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getBindType() {
        return this.bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public List<EipGeoInfo> getEipGeoRefs() {
        return this.eipGeoRefs;
    }

    public void setEipGeoRefs(List<EipGeoInfo> eipGeoRefs) {
        this.eipGeoRefs = eipGeoRefs;
    }

    public List<BlockInfo> getBlockInfoList() {
        return this.blockInfoList;
    }

    public void setBlockInfoList(List<BlockInfo> blockInfoList) {
        this.blockInfoList = blockInfoList;
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

    public BandwidthClusterInfo getBandwidthCluster() {
        return this.bandwidthCluster;
    }

    public void setBandwidthCluster(BandwidthClusterInfo bandwidthCluster) {
        this.bandwidthCluster = bandwidthCluster;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}