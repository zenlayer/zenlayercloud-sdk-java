package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipAddressesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的EIP总数量。
     */
    public Integer totalCount;

    /**
     * EIP列表。
     */
    public List<EipAddress> dataSet;

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

    public List<EipAddress> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<EipAddress> dataSet) {
        this.dataSet = dataSet;
    }

}