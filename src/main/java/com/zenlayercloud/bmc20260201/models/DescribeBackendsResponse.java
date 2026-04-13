package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBackendsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的后端配置服务器总数量。
     */
    public Integer totalCount;

    /**
     * 后端配置服务器集合。
     */
    public List<BackendInfo> dataSet;

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

    public List<BackendInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<BackendInfo> dataSet) {
        this.dataSet = dataSet;
    }

}