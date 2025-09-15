package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述边界网关的基本信息。
 */
public class ZbgInfo extends TeaModel {


    /**
     * 边界网关ID
     */
    public String zbgId;

    /**
     * 边界网关名称
     */
    public String name;

    /**
     * VPC的ID
     */
    public String vpcId;

    /**
     * 节点的ID
     */
    public String regionId;

    /**
     * ASN号
     */
    public Integer asn;

    /**
     * 互联IP地址段
     */
    public String interConnectCidr;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 关联的三层网络ID集合
     */
    public List<String> cloudRouterIds;

    /**
     * 路由模式
     */
    public String routingMode;

    /**
     * NAT的ID
     */
    public String natId;

    /**
     * 子网控制
     */
    public String advertisedSubnet;

    /**
     * IPv4 Cidr集合
     */
    public List<String> advertisedCidrs;

    /**
     * 自定义路由集合
     */
    public List<String> advertisedRouteIds;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Integer getAsn() {
        return this.asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    public String getInterConnectCidr() {
        return this.interConnectCidr;
    }

    public void setInterConnectCidr(String interConnectCidr) {
        this.interConnectCidr = interConnectCidr;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<String> getCloudRouterIds() {
        return this.cloudRouterIds;
    }

    public void setCloudRouterIds(List<String> cloudRouterIds) {
        this.cloudRouterIds = cloudRouterIds;
    }

    public String getRoutingMode() {
        return this.routingMode;
    }

    public void setRoutingMode(String routingMode) {
        this.routingMode = routingMode;
    }

    public String getNatId() {
        return this.natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public String getAdvertisedSubnet() {
        return this.advertisedSubnet;
    }

    public void setAdvertisedSubnet(String advertisedSubnet) {
        this.advertisedSubnet = advertisedSubnet;
    }

    public List<String> getAdvertisedCidrs() {
        return this.advertisedCidrs;
    }

    public void setAdvertisedCidrs(List<String> advertisedCidrs) {
        this.advertisedCidrs = advertisedCidrs;
    }

    public List<String> getAdvertisedRouteIds() {
        return this.advertisedRouteIds;
    }

    public void setAdvertisedRouteIds(List<String> advertisedRouteIds) {
        this.advertisedRouteIds = advertisedRouteIds;
    }

}