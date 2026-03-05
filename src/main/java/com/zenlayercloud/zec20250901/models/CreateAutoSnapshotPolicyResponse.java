package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateAutoSnapshotPolicyResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 自动快照策略的ID。
     */
    public String autoSnapshotPolicyId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    }

}