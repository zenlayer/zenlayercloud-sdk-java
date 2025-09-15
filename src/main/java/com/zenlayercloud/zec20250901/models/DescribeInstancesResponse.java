package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述实例列表的请求参数。
 */
public class DescribeInstancesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 实例列表的数据
     */
    public List<InstanceInfo> dataSet;

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

    public List<InstanceInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<InstanceInfo> dataSet) {
        this.dataSet = dataSet;
    }

}