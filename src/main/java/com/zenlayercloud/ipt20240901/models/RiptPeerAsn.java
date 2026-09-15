package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * BGP 档位与 Zenlayer 侧（对端）AS 号的对应关系。
 */
public class RiptPeerAsn extends TeaModel {


    /**
     * BGP 档位。
     */
    public String tier;

    /**
     * 该档位对应的 Zenlayer 侧（对端）AS 号。
     */
    public Long asn;

    public String getTier() {
        return this.tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

}