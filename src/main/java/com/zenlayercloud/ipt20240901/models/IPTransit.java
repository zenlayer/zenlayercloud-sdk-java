package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * IP Transit信息。
 */
public class IPTransit extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    /**
     * IP Transit名称。
     */
    public String iptName;

    /**
     * IP Transit描述。
     */
    public String iptDescription;

    /**
     * IP Transit所在数据中心。
     */
    public DatacenterInfo dataCenter;

    /**
     * 对端数据中心端口 ID。
     */
    public String peerPortId;

    /**
     * 对端数据中心端口名称。
     */
    public String peerPortName;

    /**
     * 对端数据中心端口所在数据中心。
     */
    public DatacenterInfo peerDataCenter;

    /**
     * 开通方式。
     */
    public String deliveryType;

    /**
     * 资源组 ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 路由模式。
     */
    public String routingType;

    /**
     * 网络计费方式。
     */
    public String internetType;

    /**
     * 带宽（Mbps）。
     */
    public Integer bandwidth;

    /**
     * 保底带宽（Mbps）。
     */
    public Integer commitBandwidth;

    /**
     * BFD 配置。
     */
    public BFDConfig bfd;

    /**
     * BGP 相关配置。
     */
    public RiptBgpConfig bgp;

    /**
     * 互联地址配置。
     */
    public Interconnect interconnect;

    /**
     * 关联的 VLL ID。
     */
    public String privateConnectId;

    /**
     * 关联的 VLL 名称。
     */
    public String privateConnectName;

    /**
     * 公网 IPv4 地址列表。
     */
    public List<IPAddress> publicIpv4Addresses;

    /**
     * 业务状态。
     */
    public String iptStatus;

    /**
     * 链路连通性状态。
     */
    public String connectivityStatus;

    /**
     * 该IP Transit关联的标签。
     */
    public Tags tags;

    /**
     * 公网 IP 地址列表。
     */
    public List<IPTransitIpAddress> publicIpAddresses;

    /**
     * 高可用模式。
     */
    public String haMode;

    /**
     * ZBG 区域 ID。
     * ZBG 场景下的 IP Transit 将返回此字段。
     */
    public String zbgRegionId;

    /**
     * 对端数据中心端口类型。
     */
    public String peerPortType;

    /**
     * HA 子链路列表。
     * 非 HA 模式下为 null；HA 模式下含两个子链路对象。
     */
    public List<HaLink> haLinks;

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
    }

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

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
    }

    public String getPeerPortName() {
        return this.peerPortName;
    }

    public void setPeerPortName(String peerPortName) {
        this.peerPortName = peerPortName;
    }

    public DatacenterInfo getPeerDataCenter() {
        return this.peerDataCenter;
    }

    public void setPeerDataCenter(DatacenterInfo peerDataCenter) {
        this.peerDataCenter = peerDataCenter;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
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

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public String getInternetType() {
        return this.internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

    public BFDConfig getBfd() {
        return this.bfd;
    }

    public void setBfd(BFDConfig bfd) {
        this.bfd = bfd;
    }

    public RiptBgpConfig getBgp() {
        return this.bgp;
    }

    public void setBgp(RiptBgpConfig bgp) {
        this.bgp = bgp;
    }

    public Interconnect getInterconnect() {
        return this.interconnect;
    }

    public void setInterconnect(Interconnect interconnect) {
        this.interconnect = interconnect;
    }

    public String getPrivateConnectId() {
        return this.privateConnectId;
    }

    public void setPrivateConnectId(String privateConnectId) {
        this.privateConnectId = privateConnectId;
    }

    public String getPrivateConnectName() {
        return this.privateConnectName;
    }

    public void setPrivateConnectName(String privateConnectName) {
        this.privateConnectName = privateConnectName;
    }

    public List<IPAddress> getPublicIpv4Addresses() {
        return this.publicIpv4Addresses;
    }

    public void setPublicIpv4Addresses(List<IPAddress> publicIpv4Addresses) {
        this.publicIpv4Addresses = publicIpv4Addresses;
    }

    public String getIptStatus() {
        return this.iptStatus;
    }

    public void setIptStatus(String iptStatus) {
        this.iptStatus = iptStatus;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public List<IPTransitIpAddress> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<IPTransitIpAddress> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }

    public String getHaMode() {
        return this.haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public String getZbgRegionId() {
        return this.zbgRegionId;
    }

    public void setZbgRegionId(String zbgRegionId) {
        this.zbgRegionId = zbgRegionId;
    }

    public String getPeerPortType() {
        return this.peerPortType;
    }

    public void setPeerPortType(String peerPortType) {
        this.peerPortType = peerPortType;
    }

    public List<HaLink> getHaLinks() {
        return this.haLinks;
    }

    public void setHaLinks(List<HaLink> haLinks) {
        this.haLinks = haLinks;
    }

}