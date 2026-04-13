package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateSecurityGroupRequest extends TeaModel {


    /**
     * 安全组名称。
     * 范围1到64个字符，仅支持字母、数字、-和英文句点(.)。
     */
    public String securityGroupName;

    /**
     * 安全组规则。
     */
    public List<RuleInfo> ruleInfos;

    /**
     * 安全组描述。
     * 范围2到256个字符。
     */
    public String description;

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public List<RuleInfo> getRuleInfos() {
        return this.ruleInfos;
    }

    public void setRuleInfos(List<RuleInfo> ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}