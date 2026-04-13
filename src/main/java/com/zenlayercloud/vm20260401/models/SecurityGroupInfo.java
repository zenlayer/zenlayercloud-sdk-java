package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 安全组信息。
 */
public class SecurityGroupInfo extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 安全组名称。
     */
    public String securityGroupName;

    /**
     * 安全组状态。
     */
    public String securityGroupStatus;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String createTime;

    /**
     * 安全组描述。
     */
    public String description;

    /**
     * 已绑定实例ID集合。
     */
    public List<String> instanceIds;

    /**
     * 安全组规则。
     */
    public List<RuleInfo> ruleInfos;

    /**
     * 是否默认。
     */
    public Boolean isDefault;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public String getSecurityGroupStatus() {
        return this.securityGroupStatus;
    }

    public void setSecurityGroupStatus(String securityGroupStatus) {
        this.securityGroupStatus = securityGroupStatus;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public List<RuleInfo> getRuleInfos() {
        return this.ruleInfos;
    }

    public void setRuleInfos(List<RuleInfo> ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

}