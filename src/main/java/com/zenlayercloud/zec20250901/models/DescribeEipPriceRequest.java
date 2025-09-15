package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询公网弹性IP的价格。
 */
public class DescribeEipPriceRequest extends TeaModel {


    /**
     * 创建EIP所在的节点ID
     */
    public String regionId;

    /**
     * 公网弹性IP的网络计费方式
     */
    public String internetChargeType;

    /**
     * 需要创建EIP的数量
     */
    public Integer amount;

    /**
     * 公网弹性IP的线路类型
     */
    public String eipV4Type;

    /**
     * 公网弹性IP的带宽限速。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * 公网IPv6的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是流量计费(`ByTrafficPackage`)需要指定
     */
    public Double flowPackage;

    /**
     * 指定CIDR ID，使用CIDR内分配弹性IP。
     * 该字段和`eipV4Type`不能同时指定
     */
    public String cidrId;

    /**
     * 公网IPv6所指定的共享带宽包ID。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是共享带宽包计费(`BandwidthCluster`)需要指定
     */
    public String clusterId;

    /**
     * 远端的节点ID
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

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
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