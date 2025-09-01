package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifySnapshotsAttributeRequest extends TeaModel {


    /**
     * 快照ID列表
     */
    public List<String> snapshotIds;

    /**
     * 快照名称
     */
    public String snapshotName;

    public List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public void setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

}