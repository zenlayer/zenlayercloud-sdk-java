package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的资源总数量。
     */
    public Integer totalCount;

    /**
     * 资源列表。
     */
    public List<ResourceSearchInfo> dataSet;

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

    public List<ResourceSearchInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<ResourceSearchInfo> dataSet) {
        this.dataSet = dataSet;
    }

}