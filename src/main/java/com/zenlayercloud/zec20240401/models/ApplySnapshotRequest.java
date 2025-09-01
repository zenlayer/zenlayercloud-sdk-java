package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class ApplySnapshotRequest extends TeaModel {


    /**
     * 快照唯一ID
     */
    public String snapshotId;

    /**
     * 云硬盘ID
     */
    public String diskId;

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

}