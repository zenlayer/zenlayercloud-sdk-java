package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyBorderGatewayInterconnectCidrRequest extends TeaModel {


    /**
     * 要修改的边界网关ID。
     * 可通过调用 ~~DescribeBorderGateways~~ 获取。
     */
    public String zbgId;

    /**
     * 互联IP网段。
     * 仅支持169.254.x.x/27。
     */
    public String interConnectCidr;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public String getInterConnectCidr() {
        return this.interConnectCidr;
    }

    public void setInterConnectCidr(String interConnectCidr) {
        this.interConnectCidr = interConnectCidr;
    }

}