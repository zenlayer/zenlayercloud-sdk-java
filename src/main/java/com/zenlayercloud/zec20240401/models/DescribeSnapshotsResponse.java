package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSnapshotsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * totalCount
     */
    public Integer totalCount;

    /**
     * dataSet
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