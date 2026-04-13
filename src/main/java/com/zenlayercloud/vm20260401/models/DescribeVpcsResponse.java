package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeVpcsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * VPC结果集。
     */
    public List<VpcNetworkInfo> dataSet;

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

    public List<VpcNetworkInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<VpcNetworkInfo> dataSet) {
        this.dataSet = dataSet;
    }

}