package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class DescribeAvailableBorderGatewayResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * zbgId
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