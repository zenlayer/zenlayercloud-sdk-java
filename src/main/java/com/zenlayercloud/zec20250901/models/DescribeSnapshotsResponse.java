package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述快照列表的响应信息。
 */
public class DescribeSnapshotsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的快照总数
     */
    public Integer totalCount;

    /**
     * 返回的快照列表数据
     */
    public List<SnapshotInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SnapshotInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<SnapshotInfo> dataSet) {
        this.dataSet = dataSet;
    }

}