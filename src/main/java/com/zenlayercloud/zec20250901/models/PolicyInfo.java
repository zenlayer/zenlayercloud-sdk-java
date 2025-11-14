package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述防护策略的信息。
 */
public class PolicyInfo extends TeaModel {


    /**
     * 防护策略唯一ID
     */
    public String policyId;

    /**
     * 防护策略名称
     */
    public String policyName;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 防护策略所属的资源组ID
     */
    public String resourceGroupId;

    /**
     * 防护策略所属的资源组名称
     */
    public String resourceGroupName;

    /**
     * 防护策略关联的标签
     */
    public Tags tags;

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

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}