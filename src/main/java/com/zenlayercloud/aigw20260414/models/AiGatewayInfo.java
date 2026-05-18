package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述AI网关实例的信息。包括过期策略，状态，模型限制等。
 */
public class AiGatewayInfo extends TeaModel {


    /**
     * AI网关唯一ID。
     */
    public String gatewayUuid;

    /**
     * AI网关显示名称。
     */
    public String gatewayName;

    /**
     * 是否启用。
     */
    public Boolean enabled;

    /**
     * 创建时间。
     */
    public String createdAt;

    /**
     * 更新时间。
     */
    public String updatedAt;

    /**
     * AI网关所属的资源组ID。
     */
    public String resourceGroupId;

    /**
     * 配额。
     */
    public Integer accessLimit;

    /**
     * 过期时间类型。
     */
    public String expireType;

    /**
     * 过期时间。
     */
    public String expireTime;

    /**
     * 模型访问限制。
     */
    public String modelAccess;

    /**
     * AI网关关联的标签。
     */
    public Tags tags;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getAccessLimit() {
        return this.accessLimit;
    }

    public void setAccessLimit(Integer accessLimit) {
        this.accessLimit = accessLimit;
    }

    public String getExpireType() {
        return this.expireType;
    }

    public void setExpireType(String expireType) {
        this.expireType = expireType;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getModelAccess() {
        return this.modelAccess;
    }

    public void setModelAccess(String modelAccess) {
        this.modelAccess = modelAccess;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}