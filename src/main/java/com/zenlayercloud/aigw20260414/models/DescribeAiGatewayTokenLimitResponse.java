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

}