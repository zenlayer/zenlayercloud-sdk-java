package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateQosPolicyGroupRequest extends TeaModel {


    /**
     * QoS策略组所在地域ID。
     */
    public String regionId;

    /**
     * QoS策略组名称。
     * 长度不能超过64个字符。
     */
    public String name;

    /**
     * 带宽限制，单位Mbps。
     * 最大不得超过100000000 Mbps。
     */
    public Long bandwidthLimit;

    /**
     * 限速模式。
     */
    public String rateLimitMode;

    /**
     * 资源组ID。
     * 不填则加入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 标签列表。
     */
    public TagAssociation tags;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public void setBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}