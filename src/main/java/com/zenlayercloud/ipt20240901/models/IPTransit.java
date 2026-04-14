package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述一个IP Transit资源相关的信息。包括关联的端口，所属资源组等信息。
 */
public class IPTransit extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    /**
     * IP Transit 名称。
     */
    public String iptName;

    /**
     * IP Transit 描述信息。
     */
    public String iptDescription;

    /**
     * IP Transit 对应的数据中心。
     */
    public DatacenterInfo dataCenter;

    /**
     * 连接的端口ID。
     */
    public String peerPortId;

    /**
     * 连接的端口名称。
     */
    public String peerPortName;

    /**
     * 端口侧所属数据中心。
     */
    public DatacenterInfo peerDataCenter;

    /**
     * 交付类型。
     */
    public String deliveryType;

    /**
     * IP Transit 所属资源组ID。
     */
    public String resourceGroupId;

    /**
     * IP Transit 所属资源组名称。
     */
    public String resourceGroupName;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * 路由类型。
     */
    public String routingType;

    /**
     * 带宽计费方式。
     */
    public String internetType;

    /**
     * 带宽限速。
     * 单位Mbps。
     */
    public Integer bandwidth;

    /**
     * 承诺保底带宽。
     * 仅当带宽计费方式为ByInstanceBandwidth95 可取到值。
     */
    public Integer commitBandwidth;

    /**
     * BFD 配置。
     */
    public BFDConfig bfd;

    /**
     * BGP相关配置。
     */
    public RiptBgpConfig bgp;

    /**
     * 互联IP地址信息。
     */
    public Interconnect interconnect;

    /**
     * IP Transit 互联的专线ID。
     */
    public String privateConnectId;

    /**
     * IP Transit 互联的专线名称。
     */
    public String privateConnectName;

    /**
     * 公网IP信息。
     */
    public List<IPAddress> publicIpv4Addresses;

    /**
     * IP Transit 的业务状态。
     */
    public String iptStatus;

    /**
     * 该IP Transit关联的标签。
     */
    public Tags tags;

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

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}