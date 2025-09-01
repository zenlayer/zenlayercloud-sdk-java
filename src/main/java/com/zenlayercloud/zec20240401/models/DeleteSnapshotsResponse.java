package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteSnapshotsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * snapshotIds
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