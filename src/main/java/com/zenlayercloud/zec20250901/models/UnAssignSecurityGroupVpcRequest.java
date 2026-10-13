package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnAssignSecurityGroupVpcRequest extends TeaModel {


    /**
     * 要解绑的VPC ID。
     * 可通过调用 ~~DescribeVpcs~~ 获取。
     */
    public String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}