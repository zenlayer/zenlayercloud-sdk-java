package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateMemberPermissionRequest extends TeaModel {


    /**
     * 是否为全部资源。
     * 1：是；0：否 ，当0 是resourceGroupUid为必填。
     */
    public Integer allResource;

    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    /**
     * 访问策略唯一ID列表。
     */
    public List<String> policies;

    /**
     * 用户唯一ID列表。
     */
    public List<String> users;

    public Integer getAllResource() {
        return this.allResource;
    }

    public void setAllResource(Integer allResource) {
        this.allResource = allResource;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public List<String> getPolicies() {
        return this.policies;
    }

    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

}