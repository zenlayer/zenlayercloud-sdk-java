package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateIpv4BlockRequest extends TeaModel {


    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * Cidr Block的名称。
     * 不得超过64个字符。
     */
    public String name;

    /**
     * CIDR地址块的类型
     */
    public String cidrType;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长等属性。若指定Cidr Block的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid chargePrepaid;

    /**
     * 购买的掩码。
     * 可以从DescribeAvailableIpv4Resource接口中获取可用的掩码列表。
     */
    public Integer netmask;

    /**
     * 购买的数量。
     */
    public Integer amount;

    /**
     * Cidr Block所属的资源组ID。
     * 如果指定的区域内存在可用的VLAN，则会忽略该参数自动使用与VLAN相同的资源组。
     */
    public String resourceGroupId;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建Cidr时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidrType() {
        return this.cidrType;
    }

    public void setCidrType(String cidrType) {
        this.cidrType = cidrType;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public ChargePrepaid getChargePrepaid() {
        return this.chargePrepaid;
    }

    public void setChargePrepaid(ChargePrepaid chargePrepaid) {
        this.chargePrepaid = chargePrepaid;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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