package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteAutoSnapshotPoliciesRequest extends TeaModel {


    /**
     * 要删除的自动快照策略ID列表
     */
    public List<String> autoSnapshotPolicyIds;

    public List<String> getAutoSnapshotPolicyIds() {
        return this.autoSnapshotPolicyIds;
    }

    public void setAutoSnapshotPolicyIds(List<String> autoSnapshotPolicyIds) {
        this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
    }

}