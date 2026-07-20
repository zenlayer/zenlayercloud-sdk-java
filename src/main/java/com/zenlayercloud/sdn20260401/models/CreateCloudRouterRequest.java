package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateCloudRouterRequest extends TeaModel {


    /**
     * 三层网络的名称。
     * 长度不超过 255，不传则默认为 cloud-router-{时间戳}。
     */
    public String cloudRouterName;

    /**
     * 三层网络的描述信息。
     * 长度不超过 255。
     */
    public String cloudRouterDescription;

    /**
     * 边缘连接点信息。
     * 至少需要 2 个连接点。
     */
    public List<CreateCloudRouterEdgePoint> edgePoints;

    /**
     * 资源组 ID。
     * 不传则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建三层网络时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

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

    public List<CreateCloudRouterEdgePoint> getEdgePoints() {
        return this.edgePoints;
    }

    public void setEdgePoints(List<CreateCloudRouterEdgePoint> edgePoints) {
        this.edgePoints = edgePoints;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}