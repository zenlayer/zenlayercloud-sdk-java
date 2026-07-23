package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryCreateIPTransitPriceRequest extends TeaModel {


    /**
     * 对端数据中心端口 ID。
     */
    public String peerPortId;

    /**
     * 本端数据中心 ID。
     * 为空代表本地连接（Local IPT）。
     */
    public String iptDcId;

    /**
     * 网络计费方式。
     */
    public String internetType;

    /**
     * 保底带宽。
     * 单位Mbps。
     * 有且仅当internetType=ByInstanceBandwidth95时该字段必传。
     */
    public Integer commitBandwidth;

    /**
     * 带宽限速。
     * 单位Mbps。
     * 最小值不能低于5Mbps。
     * 默认值为5Mbps。
     * 95 计费下必须大于等于 `commitBandwidth`。
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
     * BGP入站路由类型。
     */
    public String bgpRouteType;

    /**
     * IP 类型（IPV4 / IPV6）。
     * 默认 IPV4。
     */
    public String ipType;

    /**
     * 公网 IP 分配列表。
     * 与 `publicIPv4BlockSize` 互斥，优先级更高。
     * 传此字段时 `publicIPv4BlockSize` 被忽略。
     */
    public List<IPTransitIpRequest> publicIpList;

    /**
     * ZBG 接入节点 ID。
     * 非空时走 Router RIPT 询价流程。
     */
    public String zbgRegionId;

    /**
     * HA 高可用配置。
     * 非空时询价包含 2 条 VLL 价格。
     */
    public IPTransitHaConfig haConfig;

    /**
     * 公网互联块掩码。
     * 非空时响应包含公网互联 IP 块价格。
     */
    public Integer publicInterconnectNetmask;

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
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

    public String getBgpRouteType() {
        return this.bgpRouteType;
    }

    public void setBgpRouteType(String bgpRouteType) {
        this.bgpRouteType = bgpRouteType;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
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