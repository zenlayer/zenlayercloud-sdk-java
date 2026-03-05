package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteIpv6CidrRequest extends TeaModel {


    /**
     * IPv6 地址块ID。
     */
    public String cidrId;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

}