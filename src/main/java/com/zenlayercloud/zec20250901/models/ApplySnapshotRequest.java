package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ApplySnapshotRequest extends TeaModel {


    /**
     * 快照唯一ID。
     * 可通过调用 ~~DescribeSnapshots~~ 获取。
     */
    public String snapshotId;

    /**
     * 云硬盘ID。
     * 可通过调用 ~~DescribeDisks~~ 获取。
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