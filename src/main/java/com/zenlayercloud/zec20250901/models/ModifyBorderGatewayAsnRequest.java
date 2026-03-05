package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyBorderGatewayAsnRequest extends TeaModel {


    /**
     * 要修改的边界网关ID。
     */
    public String zbgId;

    /**
     * ASN。
     */
    public Integer asn;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public Integer getAsn() {
        return this.asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

}