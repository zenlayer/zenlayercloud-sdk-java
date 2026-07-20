package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePrivateConnectsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的二层网络专线总数量。
     */
    public Integer totalCount;

    /**
     * 二层网络专线列表。
     */
    public List<PrivateConnect> dataSet;

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

    public List<PrivateConnect> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<PrivateConnect> dataSet) {
        this.dataSet = dataSet;
    }

}