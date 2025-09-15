package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 配置安全组规则的请求参数。
 */
public class ConfigureSecurityGroupRulesRequest extends TeaModel {


    /**
     * 要配置的安全组ID
     */
    public String securityGroupId;

    /**
     * 需要配置的安全组规则列表。
     * 注意：配置为全量覆盖
     */
    public List<SecurityGroupRuleInfo> ruleInfos;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public List<SecurityGroupRuleInfo> getRuleInfos() {
        return this.ruleInfos;
    }

    public void setRuleInfos(List<SecurityGroupRuleInfo> ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

}