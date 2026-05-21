package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述非托管出口IP的信息。
 */
public class UnmanagedEgressIpInfo extends TeaModel {


    /**
     * 非托管出口IP的唯一ID。
     */
    public String unmanagedEgressIpId;

    /**
     * 公网IP地址。
     */
    public String ip;

    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 所属VPC的唯一ID。
     */
    public String vpcId;

    /**
     * 资源状态。
     */
    public String status;

    /**
     * 网络类型。
     */
    public String networkLineType;

    /**
     * 网络计费方式。
     */
    public String internetChargeType;

    /**
     * 带宽上限，单位 Mbps。资源未单独配置带宽时返回团队默认带宽上限。
     */
    public Integer bandwidthCap;

    /**
     * 限速模式。
     */
    public String rateLimitMode;

    /**
     * 创建时间。
     */
    public String createTime;

    public String getUnmanagedEgressIpId() {
        return this.unmanagedEgressIpId;
    }

    public void setUnmanagedEgressIpId(String unmanagedEgressIpId) {
        this.unmanagedEgressIpId = unmanagedEgressIpId;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getBandwidthCap() {
        return this.bandwidthCap;
    }

    public void setBandwidthCap(Integer bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}