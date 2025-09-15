package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建边界网关的响应值。
 */
public class CreateBorderGatewayResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 边界网关的ID
     */
    public String zbgId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

}