package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建安全组的请求信息。
 */
public class CreateSecurityGroupRequest extends TeaModel {


    /**
     * 范围。
     * 目前只支持`Global`
     */
    public String scope;

    /**
     * 安全组名称。
     * 范围1到64个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    public String securityGroupName;

    /**
     * 安全组的规则
     */
    public List<SecurityGroupRuleInfo> ruleInfos;

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public List<SecurityGroupRuleInfo> getRuleInfos() {
        return this.ruleInfos;
    }

    public void setRuleInfos(List<SecurityGroupRuleInfo> ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

}