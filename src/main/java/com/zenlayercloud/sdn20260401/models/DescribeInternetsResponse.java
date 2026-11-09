package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInternetsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * Internet结果集。
     */
    public List<Internet> dataSet;

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

    public List<Internet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<Internet> dataSet) {
        this.dataSet = dataSet;
    }

}