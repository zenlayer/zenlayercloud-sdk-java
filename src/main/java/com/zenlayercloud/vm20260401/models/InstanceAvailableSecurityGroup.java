package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述实例可绑定的安全组信息。
 */
public class InstanceAvailableSecurityGroup extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 安全组名称。
     */
    public String securityGroupName;

    /**
     * 安全组是否默认。
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

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

}