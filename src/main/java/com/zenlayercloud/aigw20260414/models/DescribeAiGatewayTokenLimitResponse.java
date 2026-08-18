package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeAiGatewayTokenLimitResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * Token配额限制。
     */
    public Integer tokenLimit;

    /**
     * 日额度限制。
     */
    public Integer dailyLimit;

    /**
     * 月额度限制。
     */
    public Integer monthlyLimit;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTokenLimit() {
        return this.tokenLimit;
    }

    public void setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

    public Integer getDailyLimit() {
        return this.dailyLimit;
    }

    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Integer getMonthlyLimit() {
        return this.monthlyLimit;
    }

    public void setMonthlyLimit(Integer monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

}