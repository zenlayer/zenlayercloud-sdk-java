package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * QoS策略组信息。
 */
public class QosPolicyGroup extends TeaModel {


    /**
     * QoS策略组ID。
     */
    public String qosPolicyGroupId;

    /**
     * QoS策略组名称。
     */
    public String name;

    /**
     * 地域ID。
     */
    public String regionId;

    /**
     * 带宽限制，单位Mbps。
     */
    public Long bandwidthLimit;

    /**
     * 限速模式。
     */
    public String rateLimitMode;

    /**
     * 成员数量。
     */
    public Integer memberCount;

    /**
     * 成员列表。
     */
    public List<QosPolicyGroupMember> members;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 所属资源组信息。
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 标签列表。
     */
    public Tags tags;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
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

    public Integer getMemberCount() {
        return this.memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public List<QosPolicyGroupMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<QosPolicyGroupMember> members) {
        this.members = members;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}