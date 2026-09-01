package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateDisksRequest extends TeaModel {


    /**
     * 后付费云硬盘的承诺周期。
     * 仅在需要指定承诺周期时传递。
     */
    public ChargePostpaid instanceChargePostpaid;

    /**
     * 云硬盘所属的可用区ID。
     */
    public String zoneId;

    /**
     * 云盘名称。
     * 范围1到64个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     * 当不传`diskNames`时必填。
     */
    public String diskName;

    /**
     * 每块云硬盘各自的名称。
     * 数量需要与`diskAmount`字段一致，命名规则同`diskName`。
     * 不传则本批次云硬盘均使用`diskName`命名。
     */
    public List<String> diskNames;

    /**
     * 云硬盘大小，单位GiB。
     */
    public Integer diskSize;

    /**
     * 需要创建的云硬盘的数量。
     */
    public Integer diskAmount;

    /**
     * 云硬盘挂载的实例ID。
     */
    public String instanceId;

    /**
     * 要绑定的实例ID。
     * 数量需要与`diskAmount`字段一致，每个云硬盘各绑定一个不同实例；与`instanceId`同时传递时以`instanceId`为准。
     */
    public List<String> instanceIds;

    /**
     * 云硬盘所在的资源组ID。
     * 如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 云硬盘种类。
     * Basic NVMe SSD/BASIC_NVME_SSD: 经济型 NVMe SSD。
     * Standard NVMe SSD/NVME_SSD: 标准型 NVMe SSD。
     * 默认为Standard NVMe SSD。
     */
    public String diskCategory;

    /**
     * 使用快照ID进行创建。
     * 如果传入则根据此快照创建云硬盘，快照的云盘类型必须为数据盘快照。
     */
    public String snapshotId;

    /**
     * 市场营销的相关选项。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建云硬盘时关联的标签。
     * 注意：·关联`标签键`不能重复。
     */
    public TagAssociation tags;

    /**
     * 是否开启性能突发。
     */
    public Boolean burstingEnabled;

    public ChargePostpaid getInstanceChargePostpaid() {
        return this.instanceChargePostpaid;
    }

    public void setInstanceChargePostpaid(ChargePostpaid instanceChargePostpaid) {
        this.instanceChargePostpaid = instanceChargePostpaid;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public List<String> getDiskNames() {
        return this.diskNames;
    }

    public void setDiskNames(List<String> diskNames) {
        this.diskNames = diskNames;
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

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
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

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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

    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public void setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
    }

}