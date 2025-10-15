package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeResourceTagsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 列表总数量
     */
    public Integer totalCount;

    /**
     * 数据列表
     */
    public List<ResourceTag> dataSet;

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

    public List<ResourceTag> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<ResourceTag> dataSet) {
        this.dataSet = dataSet;
    }

}