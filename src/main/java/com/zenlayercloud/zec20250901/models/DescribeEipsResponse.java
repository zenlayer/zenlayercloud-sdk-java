package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的EIP总数
     */
    public Integer totalCount;

    /**
     * 返回的EIP列表
     */
    public List<EipInfo> dataSet;

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

    public List<EipInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<EipInfo> dataSet) {
        this.dataSet = dataSet;
    }

}