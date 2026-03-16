package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建 BYOIP 单项。
 */
public class ByoipCreateItem extends TeaModel {


    /**
     * 宣告IPv4或IPv6地址段。
     */
    public String cidrBlock;

    /**
     * 线路类型。
     * IPv6仅支持PremiumBGP。
     */
    public String networkType;

    /**
     * 区域id。
     */
    public String regionId;

    /**
     * ASN号。
     */
    public Integer asn;

    /**
     * 该参数仅在`cidrBlock`字段为IPv6地址段时生效。
     * 分配给子网的掩码长度。
     * 必须大于或等于CIDR的掩码长度。
     * 与CIDR的掩码长度范围差值小于等于4, 最大值为64。
     * 默认为CIDR的掩码长度。
     */
    public Integer subnetMaskLength;

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
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

    public Integer getSubnetMaskLength() {
        return this.subnetMaskLength;
    }

    public void setSubnetMaskLength(Integer subnetMaskLength) {
        this.subnetMaskLength = subnetMaskLength;
    }

}