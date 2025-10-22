package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建云硬盘的请求信息。
 */
public class CreateDisksRequest extends TeaModel {


    /**
     * 云硬盘所属的可用区ID
     */
    public String zoneId;

    /**
     * 云盘名称。
     * 范围1到64个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String diskName;

    /**
     * 云硬盘大小，单位GiB
     */
    public Integer diskSize;

    /**
     * 需要创建的云硬盘的数量
     */
    public Integer diskAmount;

    /**
     * 云硬盘挂在的实例ID
     */
    public String instanceId;

    /**
     * 云硬盘所在的资源组ID。
     * 如不指定则放入默认资源组
     */
    public String resourceGroupId;

    /**
     * 云硬盘种类。
     * Basic NVMe SSD: 经济型 NVMe SSD。
     * Standard NVMe SSD: 标准型 NVMe SSD。
     * 默认为Standard NVMe SSD
     */
    public String diskCategory;

    /**
     * 使用快照ID进行创建。
     * 如果传入则根据此快照创建云硬盘，快照的云盘类型必须为数据盘快照
     */
    public String snapshotId;

    /**
     * 市场营销的相关选项
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建云硬盘时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

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

}