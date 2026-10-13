package com.zenlayercloud.bmc20260201.models;

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

    /**
     * 创建byoip时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

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

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}