package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBandwidthClusterUsageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * 带宽用量数据集。
     */
    public List<BandwidthClusterUsageData> dataSet;

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

    public List<BandwidthClusterUsageData> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<BandwidthClusterUsageData> dataSet) {
        this.dataSet = dataSet;
    }

}