package com.zenlayercloud.zec20250901.models;

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

    /**
     * 快照过期时间。
     * 格式为：yyyy-MM-ddTHH:mm:ssZ。
     * 如果改成永久保留，请设置`isPermanent`=`true`，如果设置该时间必须设置为当前时间后24小时
     */
    public String retentionTime;

    /**
     * 该定期快照策略创建的快照是否永久保留
     */
    public Boolean isPermanent;

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

    public String getRetentionTime() {
        return this.retentionTime;
    }

    public void setRetentionTime(String retentionTime) {
        this.retentionTime = retentionTime;
    }

    public Boolean getIsPermanent() {
        return this.isPermanent;
    }

    public void setIsPermanent(Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

}