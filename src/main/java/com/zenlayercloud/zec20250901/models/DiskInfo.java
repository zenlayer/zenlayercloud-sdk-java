package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述云盘的基本信息。
 */
public class DiskInfo extends TeaModel {


    /**
     * 云盘的 ID
     */
    public String diskId;

    /**
     * 云盘的名称
     */
    public String diskName;

    /**
     * 云盘所在的节点ID
     */
    public String regionId;

    /**
     * 云盘所在节点的可用区ID
     */
    public String zoneId;

    /**
     * 云盘的类型
     */
    public String diskType;

    /**
     * 是否可卸载
     */
    public Boolean portable;

    /**
     * 云盘的类别
     */
    public String diskCategory;

    /**
     * 云盘的大小。
     * 单位：GiB
     */
    public Integer diskSize;

    /**
     * 云盘的状态
     */
    public String diskStatus;

    /**
     * 云盘绑定实例的ID
     */
    public String instanceId;

    /**
     * 云盘绑定实例的名称
     */
    public String instanceName;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 到期时间
     */
    public String expiredTime;

    /**
     * 周期
     */
    public Integer period;

    /**
     * 云盘所属的资源组ID
     */
    public String resourceGroupId;

    /**
     * 云盘所属的资源组名称
     */
    public String resourceGroupName;

    /**
     * 云盘序号。
     * 可能为null，表示取不到值
     */
    public String serial;

    /**
     * 是否具体快照能力
     */
    public Boolean snapshotAbility;

    /**
     * 云盘关联的自动快照策略ID
     */
    public String autoSnapshotPolicyId;

    /**
     * 该云盘关联的标签
     */
    public Tags tags;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskStatus() {
        return this.diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
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

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
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

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Boolean getSnapshotAbility() {
        return this.snapshotAbility;
    }

    public void setSnapshotAbility(Boolean snapshotAbility) {
        this.snapshotAbility = snapshotAbility;
    }

    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}