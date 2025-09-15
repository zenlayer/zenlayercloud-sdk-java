package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class AssignSecurityGroupVpcRequest extends TeaModel {


    /**
     * 要操作的VPC ID
     */
    public String vpcId;

    /**
     * 要更换的目标安全组ID
     */
    public String securityGroupId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}