package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询自动快照策略的响应值。
 */
public class DescribeAutoSnapshotPoliciesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 查询的自动快照策略数据结果
     */
    public List<AutoSnapshotPolicy> dataSet;

    /**
     * 符合匹配的总数量
     */
    public Integer totalCount;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AutoSnapshotPolicy> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<AutoSnapshotPolicy> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}