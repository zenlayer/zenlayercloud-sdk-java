package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建快照的响应信息。
 */
public class CreateSnapshotResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的快照ID
     */
    public String snapshotId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

}