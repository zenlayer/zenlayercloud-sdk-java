package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除边界网关的请求信息。
 */
public class DeleteBorderGatewayRequest extends TeaModel {


    /**
     * 要删除的边界网关ID
     */
    public String zbgId;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

}