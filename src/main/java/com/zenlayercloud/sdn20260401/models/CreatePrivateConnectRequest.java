package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreatePrivateConnectRequest extends TeaModel {


    /**
     * 二层网络专线名称。
     * 长度不超过 255，默认为 private-connect-{当前时间戳}。
     */
    public String privateConnectName;

    /**
     * 二层网络专线最大带宽限制。
     * 单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * 资源组 ID。
     * 不传则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 二层网络专线一端的连接点（A）。
     */
    public CreateEndpointParam endpointA;

    /**
     * 二层网络专线另一端的连接点（Z）。
     */
    public CreateEndpointParam endpointZ;

    /**
     * 创建二层网络专线时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    public String getPrivateConnectName() {
        return this.privateConnectName;
    }

    public void setPrivateConnectName(String privateConnectName) {
        this.privateConnectName = privateConnectName;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public CreateEndpointParam getEndpointA() {
        return this.endpointA;
    }

    public void setEndpointA(CreateEndpointParam endpointA) {
        this.endpointA = endpointA;
    }

    public CreateEndpointParam getEndpointZ() {
        return this.endpointZ;
    }

    public void setEndpointZ(CreateEndpointParam endpointZ) {
        this.endpointZ = endpointZ;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

}