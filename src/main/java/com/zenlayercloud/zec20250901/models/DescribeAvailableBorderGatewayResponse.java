package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 可绑定NAT的边界网关的相应信息。
 */
public class DescribeAvailableBorderGatewayResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可绑定NAT的边界网关ID
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