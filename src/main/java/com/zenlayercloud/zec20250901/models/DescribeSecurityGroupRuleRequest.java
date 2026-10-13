package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeSecurityGroupRuleRequest extends TeaModel {


    /**
     * 安全组ID。
     * 可通过调用 ~~DescribeSecurityGroups~~ 获取。
     */
    public String securityGroupId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}