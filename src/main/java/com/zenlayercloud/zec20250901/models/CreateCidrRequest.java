package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建CIDR请求参数
 */
public class CreateCidrRequest extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 公网IPv4的网络类型
     */
    public String eipV4Type;

    /**
     * CIDR掩码、数量
     */
    public NetmaskInfo netmask;

    /**
     * CIDR名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     * 默认会将分配的CIDR地址作为名称
     */
    public String name;

    /**
     * 资源组ID。
     * 如果不指定，则会加入默认资源组
     */
    public String resourceGroupId;

    /**
     * 市场营销相关的选项
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建CIDR时关联的标签。
     * 注意：关联`标签键`不能重复
     */
    public TagAssociation tags;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public NetmaskInfo getNetmask() {
        return this.netmask;
    }

    public void setNetmask(NetmaskInfo netmask) {
        this.netmask = netmask;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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