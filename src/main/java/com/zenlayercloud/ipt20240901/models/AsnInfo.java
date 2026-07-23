package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用 ASN 信息。
 */
public class AsnInfo extends TeaModel {


    /**
     * ASN 值。
     */
    public String asn;

    /**
     * ASN 类型。
     */
    public String asnType;

    public String getAsn() {
        return this.asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getAsnType() {
        return this.asnType;
    }

    public void setAsnType(String asnType) {
        this.asnType = asnType;
    }

}