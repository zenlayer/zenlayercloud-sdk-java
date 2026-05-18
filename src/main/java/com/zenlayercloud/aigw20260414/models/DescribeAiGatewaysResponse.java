package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiGatewaysResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * AI网关列表的数据。
     */
    public List<AiGatewayInfo> dataSet;

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

    public List<AiGatewayInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<AiGatewayInfo> dataSet) {
        this.dataSet = dataSet;
    }

}