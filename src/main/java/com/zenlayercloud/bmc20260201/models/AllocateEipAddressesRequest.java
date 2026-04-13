package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class AllocateEipAddressesRequest extends TeaModel {


    /**
     * EIP所属的可用区ID。
     */
    public String zoneId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String eipChargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。
     * 通过该参数可以指定包年包月实例的购买时长等属性。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid eipChargePrepaid;

    /**
     * 资源组ID。
     * 如果不指定，则会放入默认资源组。如果用户没有默认资源组权限， 则请求将会失败。
     */
    public String resourceGroupId;

    /**
     * 指定创建EIP的数量。
     */
    public Integer amount;

    /**
     * 购买的掩码。
     * 可以从DescribeEipAvailableResources接口中获取可用的掩码列表。
     */
    public Integer netmask;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建EIP时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getEipChargeType() {
        return this.eipChargeType;
    }

    public void setEipChargeType(String eipChargeType) {
        this.eipChargeType = eipChargeType;
    }

    public ChargePrepaid getEipChargePrepaid() {
        return this.eipChargePrepaid;
    }

    public void setEipChargePrepaid(ChargePrepaid eipChargePrepaid) {
        this.eipChargePrepaid = eipChargePrepaid;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
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