package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryModifyIPTransitPriceRequest extends TeaModel {


    /**
     * IP Transit 实例 ID。
     */
    public String iptId;

    /**
     * 变配类型。
     * 支持 BANDWIDTH、ADD_CIDR_BLOCK、DEL_CIDR_BLOCK、EXPAND_CIDR_BLOCK、SHRINK_CIDR_BLOCK，BFD/BGP/HA 操作无费用，不允许传入。
     */
    public String type;

    /**
     * 目标带宽（Mbps）。
     * type=BANDWIDTH 时必填。
     * 95 计费下必须大于等于 `commitBandwidth`。
     */
    public Integer bandwidth;

    /**
     * 保底带宽（Mbps）。
     * type=BANDWIDTH 时有效，不填则与 `bandwidth` 相同；95 计费（internetType=ByInstanceBandwidth95）下必填，不能用 `bandwidth` 代替。
     */
    public Integer commitBandwidth;

    /**
     * IPv4 CIDR 掩码长度（24–32）。
     * type=ADD_CIDR_BLOCK、EXPAND_CIDR_BLOCK、SHRINK_CIDR_BLOCK 时必填。
     */
    public Integer publicIPv4BlockSize;

    /**
     * 目标 IP 块 UUID。
     * type=DEL_CIDR_BLOCK、EXPAND_CIDR_BLOCK、SHRINK_CIDR_BLOCK 时必填。
     */
    public String ipUuid;

    /**
     * IP 网络类型。
     * type=ADD_CIDR_BLOCK 时有效，默认 BGP_IP。
     */
    public String ipNetworkType;

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getPublicIPv4BlockSize() {
        return this.publicIPv4BlockSize;
    }

    public void setPublicIPv4BlockSize(Integer publicIPv4BlockSize) {
        this.publicIPv4BlockSize = publicIPv4BlockSize;
    }

    public String getIpUuid() {
        return this.ipUuid;
    }

    public void setIpUuid(String ipUuid) {
        this.ipUuid = ipUuid;
    }

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

}