package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyIPTransitConfigRequest extends TeaModel {


    /**
     * IP Transit 实例 ID。
     */
    public String iptId;

    /**
     * 变配操作类型。
     */
    public String type;

    /**
     * 目标带宽（Mbps）。
     * type=BANDWIDTH 时必填。
     * 95 计费下必须大于等于生效后的 `commitBandwidth`。
     */
    public Integer bandwidth;

    /**
     * 保底带宽（Mbps）。
     * type=BANDWIDTH 时有效，不填则与 `bandwidth` 相同。
     */
    public Integer commitBandwidth;

    /**
     * BFD 配置。
     * type=BFD 时填写；传 null 表示关闭 BFD。
     * 高可用 IP Transit 不允许关闭 BFD。
     */
    public BFDConfig bfd;

    /**
     * BGP 配置参数。
     * type=BGP_ROUTE_TYPE、BGP_ASN_AS_SET、BGP_PASSWORD 时必填，并填写对应子字段。
     */
    public BgpConfigParam bgp;

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

    public BFDConfig getBfd() {
        return this.bfd;
    }

    public void setBfd(BFDConfig bfd) {
        this.bfd = bfd;
    }

    public BgpConfigParam getBgp() {
        return this.bgp;
    }

    public void setBgp(BgpConfigParam bgp) {
        this.bgp = bgp;
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