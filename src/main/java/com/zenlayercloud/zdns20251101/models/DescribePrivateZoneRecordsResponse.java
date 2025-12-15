package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribePrivateZoneRecordsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的内网权威域名解析记录总数
     */
    public Integer totalCount;

    /**
     * 返回的内网权威域名解析记录列表数据
     */
    public List<PrivateZoneRecord> dataSet;

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

    public List<PrivateZoneRecord> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<PrivateZoneRecord> dataSet) {
        this.dataSet = dataSet;
    }

}