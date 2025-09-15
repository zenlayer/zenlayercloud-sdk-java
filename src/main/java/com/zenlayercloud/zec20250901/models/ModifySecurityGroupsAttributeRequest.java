package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改安全组的属性
 */
public class ModifySecurityGroupsAttributeRequest extends TeaModel {


    /**
     * 安全组名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    public String securityGroupName;

    /**
     * 要操作的安全组ID列表
     */
    public List<String> securityGroupIds;

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

}