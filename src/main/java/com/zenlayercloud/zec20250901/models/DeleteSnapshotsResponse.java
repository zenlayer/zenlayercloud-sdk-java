package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeleteSnapshotsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 操作失败的快照ID。
     */
    public List<String> snapshotIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public void setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
    }

}