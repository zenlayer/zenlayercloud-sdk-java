package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassignBorderGatewayRequest extends TeaModel {


    /**
     * 要解绑NAT的边界网关ID。
     */
    public String zbgId;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

}