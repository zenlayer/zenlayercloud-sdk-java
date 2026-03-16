package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateByoipRequest extends TeaModel {


    /**
     * 待创建的 BYOIP 列表。
     */
    public List<ByoipCreateItem> byoipList;

    /**
     * 市场营销相关选项。
     */
    public MarketingInfo marketingInfo;

    /**
     * 创建后 BYOIP 所在的资源组ID。
     * 如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 创建 BYOIP 时关联的标签。
     * 注意：关联「标签键」不能重复。
     */
    public TagAssociation tags;

    public List<ByoipCreateItem> getByoipList() {
        return this.byoipList;
    }

    public void setByoipList(List<ByoipCreateItem> byoipList) {
        this.byoipList = byoipList;
    }

    public MarketingInfo getMarketingInfo() {
        return this.marketingInfo;
    }

    public void setMarketingInfo(MarketingInfo marketingInfo) {
        this.marketingInfo = marketingInfo;
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