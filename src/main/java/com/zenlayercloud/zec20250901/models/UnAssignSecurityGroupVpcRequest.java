package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * VPC解绑安全组的请求参数。
 */
public class UnAssignSecurityGroupVpcRequest extends TeaModel {


    /**
     * 要解绑的VPC ID
     */
    public String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}