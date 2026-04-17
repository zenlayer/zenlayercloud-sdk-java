package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;


public class CreateByoipRequest extends TeaModel {


    /**
     * IP 类型。
     */
    public String ipType;

    /**
     * 宣告IPv4或IPv6地址段。
     */
    public String cidr;

    /**
     * ASN号。
     */
    public Long asn;

    /**
     * 公网VLAN 唯一标识。
     */
    public String publicVirtualInterfaceId;

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getCidr() {
        return this.cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public String getPublicVirtualInterfaceId() {
        return this.publicVirtualInterfaceId;
    }

    public void setPublicVirtualInterfaceId(String publicVirtualInterfaceId) {
        this.publicVirtualInterfaceId = publicVirtualInterfaceId;
    }

}