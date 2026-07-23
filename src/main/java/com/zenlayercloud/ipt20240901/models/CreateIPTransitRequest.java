package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateIPTransitRequest extends TeaModel {


    /**
     * IP Transit名称。
     */
    public String iptName;

    /**
     * IP Transit描述。
     */
    public String iptDescription;

    /**
     * 对端数据中心端口 ID。
     */
    public String peerPortId;

    /**
     * 对端数据中心端口 VLAN。
     */
    public Integer peerPortVlan;

    /**
     * 本端数据中心 ID。
     * 为空代表本地连接（Local IPT）。
     * 传 `haConfig` 创建高可用 IP Transit 时必传。
     */
    public String iptDcId;

    /**
     * 网络计费方式。
     */
    public String internetType;

    /**
     * 保底带宽（Mbps）。
     * 95 计费（internetType=ByInstanceBandwidth95）下必传。
     */
    public Integer commitBandwidth;

    /**
     * 带宽（Mbps）。
     * 95 计费（internetType=ByInstanceBandwidth95）下必须大于等于 `commitBandwidth`。
     */
    public Integer bandwidth;

    /**
     * 路由模式。
     */
    public String routingType;

    /**
     * 公网 IPv4 地址段大小列表。
     * 与 `publicIpList` 互斥，优先级更低。
     */
    public List<Integer> publicIPv4BlockSize;

    /**
     * BFD 配置。
     * 传 `haConfig` 创建高可用 IP Transit 时必传，且后续不允许关闭。
     */
    public BFDConfig bfd;

    /**
     * 资源组 ID。
     * 不传则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * BGP相关配置。
     */
    public RiptBgpConfig bgp;

    /**
     * 创建CIDR时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

    /**
     * 公网 IP 分配列表。
     * 与 `publicIPv4BlockSize` 互斥，优先级更高。
     * 传此字段时 `publicIPv4BlockSize` 被忽略。
     */
    public List<IPTransitIpRequest> publicIpList;

    /**
     * ZBG 接入节点 ID。
     * 非空时走 Router RIPT 流程，与 `haConfig` 互斥。
     * 调用 ~~zec:DescribeInterconnectBorderGatewayRegions~~ 以获取可用的节点信息。
     */
    public String zbgRegionId;

    /**
     * HA 高可用配置。
     * 非空时走 HA 创建流程，与 `zbgRegionId` 互斥，且此时 `iptDcId` 和 `bfd` 均必传。
     */
    public IPTransitHaConfig haConfig;

    /**
     * 公网互联块掩码。
     * 非空启用公网地址互联，仅 BGP / Static 路由支持。
     * 合法值见 ~~DescribeIPTransitDatacenters~~ 响应中 availableRoutingTypes[].publicInterconnectNetmasks。
     */
    public Integer publicInterconnectNetmask;

    public String getIptName() {
        return this.iptName;
    }

    public void setIptName(String iptName) {
        this.iptName = iptName;
    }

    public String getIptDescription() {
        return this.iptDescription;
    }

    public void setIptDescription(String iptDescription) {
        this.iptDescription = iptDescription;
    }

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
    }

    public Integer getPeerPortVlan() {
        return this.peerPortVlan;
    }

    public void setPeerPortVlan(Integer peerPortVlan) {
        this.peerPortVlan = peerPortVlan;
    }

    public String getIptDcId() {
        return this.iptDcId;
    }

    public void setIptDcId(String iptDcId) {
        this.iptDcId = iptDcId;
    }

    public String getInternetType() {
        return this.internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public List<Integer> getPublicIPv4BlockSize() {
        return this.publicIPv4BlockSize;
    }

    public void setPublicIPv4BlockSize(List<Integer> publicIPv4BlockSize) {
        this.publicIPv4BlockSize = publicIPv4BlockSize;
    }

    public BFDConfig getBfd() {
        return this.bfd;
    }

    public void setBfd(BFDConfig bfd) {
        this.bfd = bfd;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public RiptBgpConfig getBgp() {
        return this.bgp;
    }

    public void setBgp(RiptBgpConfig bgp) {
        this.bgp = bgp;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

    public List<IPTransitIpRequest> getPublicIpList() {
        return this.publicIpList;
    }

    public void setPublicIpList(List<IPTransitIpRequest> publicIpList) {
        this.publicIpList = publicIpList;
    }

    public String getZbgRegionId() {
        return this.zbgRegionId;
    }

    public void setZbgRegionId(String zbgRegionId) {
        this.zbgRegionId = zbgRegionId;
    }

    public IPTransitHaConfig getHaConfig() {
        return this.haConfig;
    }

    public void setHaConfig(IPTransitHaConfig haConfig) {
        this.haConfig = haConfig;
    }

    public Integer getPublicInterconnectNetmask() {
        return this.publicInterconnectNetmask;
    }

    public void setPublicInterconnectNetmask(Integer publicInterconnectNetmask) {
        this.publicInterconnectNetmask = publicInterconnectNetmask;
    }

}