package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryCreateIPTransitPriceRequest extends TeaModel {


    /**
     * 端口的ID。
     */
    public String peerPortId;

    /**
     * IP Transit 目的地数据中心ID。
     * 如果不指定，则代表和端口位于同一个数据中心。
     */
    public String iptDcId;

    /**
     * IP Transit的带宽计费方式。
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
     * 最小值不能低于10Mbps。
     */
    public Integer bandwidth;

    /**
     * 路由类型。
     */
    public String routingType;

    /**
     * 公网IPv4地址。
     * 网段范围：24～30
     * 有且仅当路由类型是Static 或 Gateway时必须指定。
     * 目前只允许指定一个公网CIDR。
     */
    public List<Integer> publicIPv4BlockSize;

    /**
     * BGP入站路由类型。
     */
    public String bgpRouteType;

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

}