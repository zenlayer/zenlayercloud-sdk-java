package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡上的一个IPv6 CIDR。
 */
public class NicIpv6CidrBlockInfo extends TeaModel {


    /**
     * IPv6的ID。
     * 仅公网IPv6有值。
     */
    public String ipv6Id;

    /**
     * 网卡上的IPv6 CIDR，例如`2001:db8::/96`。
     */
    public String cidrBlock;

    /**
     * 该IPv6 CIDR的主IPv6地址。
     */
    public String primaryIpv6;

    /**
     * IPv6的类型。
     */
    public String ipv6Type;

    /**
     * 该IPv6 CIDR所属的子网IPv6网段。
     */
    public String subnetIpv6CidrBlock;

    public String getIpv6Id() {
        return this.ipv6Id;
    }

    public void setIpv6Id(String ipv6Id) {
        this.ipv6Id = ipv6Id;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getPrimaryIpv6() {
        return this.primaryIpv6;
    }

    public void setPrimaryIpv6(String primaryIpv6) {
        this.primaryIpv6 = primaryIpv6;
    }

    public String getIpv6Type() {
        return this.ipv6Type;
    }

    public void setIpv6Type(String ipv6Type) {
        this.ipv6Type = ipv6Type;
    }

    public String getSubnetIpv6CidrBlock() {
        return this.subnetIpv6CidrBlock;
    }

    public void setSubnetIpv6CidrBlock(String subnetIpv6CidrBlock) {
        this.subnetIpv6CidrBlock = subnetIpv6CidrBlock;
    }

}