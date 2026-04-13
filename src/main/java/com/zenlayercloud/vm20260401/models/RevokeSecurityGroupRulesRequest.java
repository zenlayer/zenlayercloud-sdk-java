package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class RevokeSecurityGroupRulesRequest extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 安全组规则。
     */
    public List<RuleInfo> ruleInfos;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public List<RuleInfo> getRuleInfos() {
        return this.ruleInfos;
    }

    public void setRuleInfos(List<RuleInfo> ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

}