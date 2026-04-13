package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateDisksRequest extends TeaModel {


    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 若指定云硬盘的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid chargePrepaid;

    /**
     * 云硬盘名称。
     * 必须以数字或字母开头或结尾，长度1-64字符，仅支持字母、数字、-和英文句点(.)。
     */
    public String diskName;

    /**
     * 云硬盘大小，单位GB。
     */
    public Integer diskSize;

    /**
     * 云硬盘创建数量。
     * 最小值与默认值均为1，最大值50。
     */
    public Integer diskAmount;

    /**
     * 创建后需要挂载的实例ID。
     * 指定实例ID将会为实例所在的可用区创建数据盘并挂载到实例上。
     */
    public String instanceId;

    /**
     * 云硬盘所属的可用区ID。
     * 如果指定了instanceId，则该字段无效。
     */
    public String zoneId;

    /**
     * 云硬盘所在的资源组ID，如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 云硬盘种类。
     * STANDARD：标准云盘。
     * SSD：固态硬盘。
     * 默认为SSD。
     */
    public String diskCategory;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建云硬盘时关联的标签。
     * 注意：关联标签键不能重复。
     */
    public TagAssociation tags;

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

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Integer getDiskAmount() {
        return this.diskAmount;
    }

    public void setDiskAmount(Integer diskAmount) {
        this.diskAmount = diskAmount;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
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