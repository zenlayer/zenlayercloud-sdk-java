package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class RenewIpv6CidrRequest extends TeaModel {


    /**
     * IPv6地址块ID。
     * 可通过调用 ~~DescribeCidrs~~ 获取。
     */
    public String cidrId;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

}