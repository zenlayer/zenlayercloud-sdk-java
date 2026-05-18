package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateAiGatewayRequest extends TeaModel {


    /**
     * 需要关联的模型uuid列表。
     * 当modelAccess为`LIMITED`时必填。
     */
    public List<String> modelUuids;

    /**
     * AI网关名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String gatewayName;

    /**
     * token配额。
     */
    public Integer tokenLimit;

    /**
     * token过期策略类型。
     * 可选范围：LONG_LIVED、CUSTOM。
     */
    public String expireType;

    /**
     * token过期时间。
     * 当expireType为`CUSTOM`时必填。
     */
    public String expireTime;

    /**
     * 创建后AI网关所在的资源组ID，如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 模型访问权限。
     * 可选范围：UNLIMITED、LIMITED。
     */
    public String modelAccess;

    /**
     * 创建AI网关时关联的标签。
     * 注意：·关联`标签键`不能重复。
     */
    public TagAssociation tags;

    public List<String> getModelUuids() {
        return this.modelUuids;
    }

    public void setModelUuids(List<String> modelUuids) {
        this.modelUuids = modelUuids;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public Integer getTokenLimit() {
        return this.tokenLimit;
    }

    public void setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getModelAccess() {
        return this.modelAccess;
    }

    public void setModelAccess(String modelAccess) {
        this.modelAccess = modelAccess;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}