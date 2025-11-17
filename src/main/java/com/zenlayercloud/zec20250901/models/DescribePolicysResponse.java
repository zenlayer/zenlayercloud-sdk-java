package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述防护策略列表。
 */
public class DescribePolicysResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 防护策略列表的数据
     */
    public List<PolicyInfo> dataSet;

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

    public List<PolicyInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<PolicyInfo> dataSet) {
        this.dataSet = dataSet;
    }

}