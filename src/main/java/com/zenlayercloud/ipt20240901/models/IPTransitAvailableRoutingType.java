package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * IP Transit可用路由模式信息。
 */
public class IPTransitAvailableRoutingType extends TeaModel {


    /**
     * 路由模式。
     */
    public String routingType;

    /**
     * 可选的 BGP 路由通告类型列表。
     * 仅 `routingType` 为 BGP 时有值。
     */
    public List<String> availableBgpRouteTypes;

    /**
     * 可选的 BGP 档位列表。
     * 仅 `routingType` 为 BGP 时有值。
     */
    public List<String> availableBgpTiers;

    /**
     * 各 BGP 档位对应的 Zenlayer 侧（对端）AS 号，供客户本地路由器 BGP 邻居配置。
     * 仅 `routingType` 为 BGP 时有值。
     */
    public List<RiptPeerAsn> peerAsns;

    /**
     * 开通方式。
     */
    public String deliveryType;

    /**
     * IPv4 公网互联可选掩码列表。
     * 目前仅 30 / 31。
     */
    public List<Integer> publicInterconnectNetmasks;

    public String getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public List<String> getAvailableBgpRouteTypes() {
        return this.availableBgpRouteTypes;
    }

    public void setAvailableBgpRouteTypes(List<String> availableBgpRouteTypes) {
        this.availableBgpRouteTypes = availableBgpRouteTypes;
    }

    public List<String> getAvailableBgpTiers() {
        return this.availableBgpTiers;
    }

    public void setAvailableBgpTiers(List<String> availableBgpTiers) {
        this.availableBgpTiers = availableBgpTiers;
    }

    public List<RiptPeerAsn> getPeerAsns() {
        return this.peerAsns;
    }

    public void setPeerAsns(List<RiptPeerAsn> peerAsns) {
        this.peerAsns = peerAsns;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public List<Integer> getPublicInterconnectNetmasks() {
        return this.publicInterconnectNetmasks;
    }

    public void setPublicInterconnectNetmasks(List<Integer> publicInterconnectNetmasks) {
        this.publicInterconnectNetmasks = publicInterconnectNetmasks;
    }

}