package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AssignSecurityGroupVpcRequest extends TeaModel {


    /**
     * 要操作的VPC ID。
     * 可通过调用 ~~DescribeVpcs~~ 获取。
     */
    public String vpcId;

    /**
     * 要更换的目标安全组ID。
     * 可通过调用 ~~DescribeSecurityGroups~~ 获取。
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