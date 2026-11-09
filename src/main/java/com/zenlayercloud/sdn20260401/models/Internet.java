package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * Internet信息。
 */
public class Internet extends TeaModel {


    /**
     * Internet ID。
     */
    public String internetId;

    /**
     * Internet名称。
     */
    public String internetName;

    /**
     * Internet描述。
     */
    public String internetDescription;

    /**
     * Internet所在数据中心。
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
    public InternetBgpConfig bgp;

    /**
     * 互联地址配置。
     */
    public InternetInterconnect interconnect;

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
    public String internetStatus;

    /**
     * 链路连通性状态。
     */
    public String connectivityStatus;

    /**
     * 该 Internet 关联的标签。
     */
    public Tags tags;

    /**
     * 公网 IP 地址列表。
     */
    public List<InternetIpAddress> publicIpAddresses;

    /**
     * 高可用模式。
     */
    public String haMode;

    /**
     * ZBG 区域 ID。
     * ZBG 场景下的 Internet 将返回此字段。
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
    public List<InternetHaLink> haLinks;

    public String getInternetId() {
        return this.internetId;
    }

    public void setInternetId(String internetId) {
        this.internetId = internetId;
    }

    public String getInternetName() {
        return this.internetName;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    public String getInternetDescription() {
        return this.internetDescription;
    }

    public void setInternetDescription(String internetDescription) {
        this.internetDescription = internetDescription;
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

    public InternetBgpConfig getBgp() {
        return this.bgp;
    }

    public void setBgp(InternetBgpConfig bgp) {
        this.bgp = bgp;
    }

    public InternetInterconnect getInterconnect() {
        return this.interconnect;
    }

    public void setInterconnect(InternetInterconnect interconnect) {
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

    public String getInternetStatus() {
        return this.internetStatus;
    }

    public void setInternetStatus(String internetStatus) {
        this.internetStatus = internetStatus;
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

    public List<InternetIpAddress> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<InternetIpAddress> publicIpAddresses) {
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

    public List<InternetHaLink> getHaLinks() {
        return this.haLinks;
    }

    public void setHaLinks(List<InternetHaLink> haLinks) {
        this.haLinks = haLinks;
    }

}