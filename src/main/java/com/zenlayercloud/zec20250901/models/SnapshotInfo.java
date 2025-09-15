package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述快照的信息。
 */
public class SnapshotInfo extends TeaModel {


    /**
     * 快照唯一ID
     */
    public String snapshotId;

    /**
     * 快照显示名称
     */
    public String snapshotName;

    /**
     * 快照所属的可用区ID
     */
    public String zoneId;

    /**
     * 快照的状态
     */
    public String status;

    /**
     * 快照的类型
     */
    public String snapshotType;

    /**
     * 快照的保留到期时间。
     * 如果取不到值，说明快照为永久保留
     */
    public String retentionTime;

    /**
     * 云盘ID
     */
    public String diskId;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 是否具备创建disk的能力
     */
    public Boolean diskAbility;

    /**
     * 所属的资源组信息
     */
    public ResourceGroupInfo resourceGroup;

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSnapshotType() {
        return this.snapshotType;
    }

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    public String getRetentionTime() {
        return this.retentionTime;
    }

    public void setRetentionTime(String retentionTime) {
        this.retentionTime = retentionTime;
    }

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getDiskAbility() {
        return this.diskAbility;
    }

    public void setDiskAbility(Boolean diskAbility) {
        this.diskAbility = diskAbility;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

}