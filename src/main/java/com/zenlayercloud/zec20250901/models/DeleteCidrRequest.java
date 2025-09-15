package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述删除CIDR请求信息。
 */
public class DeleteCidrRequest extends TeaModel {


    /**
     * 要删除的CIDR ID
     */
    public String cidrId;

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

}