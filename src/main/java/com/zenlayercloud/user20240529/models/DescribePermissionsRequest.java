package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePermissionsRequest extends TeaModel {


    /**
     * 访问策略名称。
     */
    public String policyName;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    /**
     * 用户唯一ID。
     */
    public String userUid;

    /**
     * 是否为全部资源。
     * 1：是；0：否。
     */
    public Integer allResource;

    /**
     * 用户组名称。
     */
    public String memberGroupName;

    /**
     * 用户组唯一ID。
     */
    public String memberGroupId;

    /**
     * 权限类别 成员或者成员组 默认查询全部。
     * 成员：BY_SELF，成员组：BY_MEMBER_GROUP
     */
    public String associated;

    /**
     * 按时间排序默认1。
     * 1：顺序，0：倒序。
     */
    public Integer order;

    /**
     * 分页数。
     */
    public Integer pageNum;

    /**
     * 分页大小。
     */
    public Integer pageSize;

    public String getPolicyName() {
        return this.policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getUserUid() {
        return this.userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public Integer getAllResource() {
        return this.allResource;
    }

    public void setAllResource(Integer allResource) {
        this.allResource = allResource;
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

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}