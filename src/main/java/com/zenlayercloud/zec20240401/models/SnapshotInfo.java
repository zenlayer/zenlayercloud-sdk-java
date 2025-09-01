package com.zenlayercloud.zec20240401.models;

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
     * 网卡所属的资源组信息
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
}