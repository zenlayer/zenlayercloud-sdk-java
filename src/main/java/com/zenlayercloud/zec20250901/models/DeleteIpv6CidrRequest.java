package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除IPv6地址块的请求信息。
 */
public class DeleteIpv6CidrRequest extends TeaModel {


    /**
     * IPv6 地址块ID
     */
    public String cidrId;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

}