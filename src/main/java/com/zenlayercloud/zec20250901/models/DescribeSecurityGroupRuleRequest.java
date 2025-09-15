package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DescribeSecurityGroupRuleRequest extends TeaModel {


    /**
     * 安全组ID
     */
    public String securityGroupId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}