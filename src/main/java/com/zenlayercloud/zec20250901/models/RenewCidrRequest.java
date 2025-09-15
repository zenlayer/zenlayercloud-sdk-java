package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述恢复CIDR请求信息。
 */
public class RenewCidrRequest extends TeaModel {


    /**
     * 要恢复的CIDR ID
     */
    public String cidrId;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

}