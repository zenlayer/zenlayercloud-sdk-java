package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CancelAutoSnapshotPolicyRequest extends TeaModel {


    /**
     * 自动快照策略ID。
     * 可通过调用 ~~DescribeAutoSnapshotPolicies~~ 获取。
     */
    public String autoSnapshotPolicyId;

    /**
     * 要移除的磁盘ID列表。
     * 可通过调用 ~~DescribeDisks~~ 获取。
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