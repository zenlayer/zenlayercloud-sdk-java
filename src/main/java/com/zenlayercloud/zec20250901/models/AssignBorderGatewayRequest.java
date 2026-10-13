package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AssignBorderGatewayRequest extends TeaModel {


    /**
     * 边界网关ID。
     * 可通过调用 ~~DescribeBorderGateways~~ 获取。
     */
    public String zbgId;

    /**
     * NAT网关ID。
     * 可通过调用 ~~DescribeNatGateways~~ 获取。
     */
    public String natId;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public String getNatId() {
        return this.natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

}