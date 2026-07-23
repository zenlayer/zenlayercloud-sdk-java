package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeEipPriceRequest extends TeaModel {


    /**
     * 创建EIP所在的节点ID。
     */
    public String regionId;

    /**
     * 公网弹性IP的网络计费方式。
     */
    public String internetChargeType;

    /**
     * 需要创建EIP的数量。
     */
    public Integer amount;

    /**
     * 公网弹性IP的线路类型。
     * 已废弃，请使用`networkLineType`。
     */
    @Deprecated
    public String eipV4Type;

    /**
     * 公网弹性IP的线路类型。
     */
    public String networkLineType;

    /**
     * 公网弹性IP的带宽限速。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    /**
     * 弹性公网IP的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 当网络计费方式为流量计费(`ByTrafficPackage`)时需要指定。
     */
    public Double flowPackage;

    /**
     * 指定CIDR ID，使用CIDR内分配弹性IP。
     * 该字段和`eipV4Type`不能同时指定。
     */
    public String cidrId;

    /**
     * 共享带宽包ID。
     * 当指定`peerRegionId`且网络计费方式为共享带宽包计费(`BandwidthCluster`)时需要指定。
     */
    public String clusterId;

    /**
     * 远端的节点ID。
     */
    public String peerRegionId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Deprecated
    public String getEipV4Type() {
        return this.eipV4Type;
    }

    @Deprecated
    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getPeerRegionId() {
        return this.peerRegionId;
    }

    public void setPeerRegionId(String peerRegionId) {
        this.peerRegionId = peerRegionId;
    }

}