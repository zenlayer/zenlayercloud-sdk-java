package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述公网IP池的请求参数。
 */
public class DescribePoolsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 公网IP池列表的结果数据
     */
    public List<PoolInfo> dataSet;

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

    public List<PoolInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<PoolInfo> dataSet) {
        this.dataSet = dataSet;
    }

}