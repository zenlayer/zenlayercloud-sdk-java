package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 子网列表的响应信息。
 */
public class DescribeSubnetsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 子网的结果集
     */
    public List<SubnetInfo> dataSet;

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

    public List<SubnetInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<SubnetInfo> dataSet) {
        this.dataSet = dataSet;
    }

}