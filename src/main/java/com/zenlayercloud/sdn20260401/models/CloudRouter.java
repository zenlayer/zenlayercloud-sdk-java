package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 三层网络的详细信息。
 */
public class CloudRouter extends TeaModel {


    /**
     * 三层网络的 ID。
     */
    public String cloudRouterId;

    /**
     * 三层网络的名称。
     */
    public String cloudRouterName;

    /**
     * 三层网络的描述信息。
     */
    public String cloudRouterDescription;

    /**
     * 三层网络的创建时间。
     */
    public String createTime;

    /**
     * 三层网络的过期时间。
     */
    public String expiredTime;

    /**
     * 三层网络的回收时间。
     */
    public String recycledTime;

    /**
     * 三层网络的边缘连接点列表。
     */
    public List<CloudRouterEdgePoint> edgePoints;

    /**
     * 三层网络的业务状态。
     */
    public String cloudRouterStatus;

    /**
     * 三层网络的连通性状态。
     */
    public String connectivityStatus;

    /**
     * 三层网络所属的资源组 ID。
     */
    public String resourceGroupId;

    /**
     * 三层网络所属的资源组名称。
     */
    public String resourceGroupName;

    /**
     * 三层网络的购买时长（月）。
     */
    public Integer period;

    /**
     * 三层网络的业务来源。
     */
    public String source;

    /**
     * 三层网络关联的标签。
     */
    public Tags tags;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

    public String getCloudRouterName() {
        return this.cloudRouterName;
    }

    public void setCloudRouterName(String cloudRouterName) {
        this.cloudRouterName = cloudRouterName;
    }

    public String getCloudRouterDescription() {
        return this.cloudRouterDescription;
    }

    public void setCloudRouterDescription(String cloudRouterDescription) {
        this.cloudRouterDescription = cloudRouterDescription;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getRecycledTime() {
        return this.recycledTime;
    }

    public void setRecycledTime(String recycledTime) {
        this.recycledTime = recycledTime;
    }

    public List<CloudRouterEdgePoint> getEdgePoints() {
        return this.edgePoints;
    }

    public void setEdgePoints(List<CloudRouterEdgePoint> edgePoints) {
        this.edgePoints = edgePoints;
    }

    public String getCloudRouterStatus() {
        return this.cloudRouterStatus;
    }

    public void setCloudRouterStatus(String cloudRouterStatus) {
        this.cloudRouterStatus = cloudRouterStatus;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
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

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}