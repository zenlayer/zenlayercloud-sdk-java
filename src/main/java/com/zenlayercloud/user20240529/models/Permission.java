package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述权限的响应信息。包括权限ID，状态，用户Id等。
 */
public class Permission extends TeaModel {


    /**
     * 权限唯一ID。
     */
    public String permissionId;

    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    /**
     * 是否为全部资源。
     * 1：是；0：否。
     */
    public Integer allResource;

    /**
     * 用户唯一ID。
     */
    public String userUid;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 访问策略唯一ID。
     */
    public String policyId;

    /**
     * 访问策略名称。
     */
    public String policyName;

    /**
     * 访问策略描述。
     */
    public String policyDesc;

    /**
     * 用户名称。
     */
    public String firstName;

    /**
     * 用户姓氏。
     */
    public String lastName;

    /**
     * 用户邮箱。
     */
    public String username;

    /**
     * 用户组名称。
     */
    public String memberGroupName;

    /**
     * 用户组唯一ID。
     */
    public String memberGroupId;

    /**
     * 权限类别。
     * 成员：SELF，成员组：USER_GROUP
     */
    public String associated;

    public String getPermissionId() {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getAllResource() {
        return this.allResource;
    }

    public void setAllResource(Integer allResource) {
        this.allResource = allResource;
    }

    public String getUserUid() {
        return this.userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyDesc() {
        return this.policyDesc;
    }

    public void setPolicyDesc(String policyDesc) {
        this.policyDesc = policyDesc;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMemberGroupName() {
        return this.memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public String getAssociated() {
        return this.associated;
    }

    public void setAssociated(String associated) {
        this.associated = associated;
    }

}