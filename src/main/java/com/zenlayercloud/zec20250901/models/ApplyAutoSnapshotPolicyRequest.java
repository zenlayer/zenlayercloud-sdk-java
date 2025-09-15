package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {


    /**
     * 自动快照策略ID
     */
    public String autoSnapshotPolicyId;

    /**
     * 要添加的磁盘ID列表
     */
    public List<String> diskIds;

    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    }

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

}