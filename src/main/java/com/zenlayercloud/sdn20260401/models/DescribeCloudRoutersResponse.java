package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCloudRoutersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的三层网络总数量。
     */
    public Integer totalCount;

    /**
     * 三层网络列表。
     */
    public List<CloudRouter> dataSet;

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

    public List<CloudRouter> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<CloudRouter> dataSet) {
        this.dataSet = dataSet;
    }

}