package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifySecurityGroupsAttributeRequest extends TeaModel {


    /**
     * 安全组名称。
     * 范围1到64个字符，仅支持字母、数字、-和英文句点(.)。
     */
    public String securityGroupName;

    /**
     * 安全组描述。
     * 范围2到256个字符。
     */
    public String description;

    /**
     * 一个或多个待操作的安全组ID。
     * 每次请求批量上限为100。
     */
    public List<String> securityGroupIds;

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

}