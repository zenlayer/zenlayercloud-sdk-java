package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述创建快照的请求信息。
 */
public class CreateSnapshotRequest extends TeaModel {


    /**
     * 云硬盘ID
     */
    public String diskId;

    /**
     * 快照名称
     */
    public String snapshotName;

    /**
     * 保留的到期时间。
     * 格式为：yyyy-MM-ddTHH:mm:ssZ。
     * 如果不传，则代表永久保留。
     * 指定时间必须在当前时间24小时后
     */
    public String retentionTime;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getRetentionTime() {
        return this.retentionTime;
    }

    public void setRetentionTime(String retentionTime) {
        this.retentionTime = retentionTime;
    }

}