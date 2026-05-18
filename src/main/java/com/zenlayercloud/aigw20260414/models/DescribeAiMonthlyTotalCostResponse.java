package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeAiMonthlyTotalCostResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * AI网关月总费用。
     */
    public Double totalCost;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

}