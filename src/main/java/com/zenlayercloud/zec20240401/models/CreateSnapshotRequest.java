package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class CreateSnapshotRequest extends TeaModel {


    /**
     * 云硬盘ID。
     * 通过DescribeDisks接口查询
     */
    public String diskId;

    public String snapshotName;

    public String retentionTime;

    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(String retentionTime) {
        this.retentionTime = retentionTime;
    }
}

