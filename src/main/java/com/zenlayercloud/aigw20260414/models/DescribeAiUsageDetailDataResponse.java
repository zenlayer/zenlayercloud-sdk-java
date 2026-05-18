package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiUsageDetailDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 请求数明细数据。
     */
    public List<UsageDataPoint> request;

    /**
     * 总Token明细数据。
     */
    public List<UsageDataPoint> token;

    /**
     * 输入Token明细数据。
     */
    public List<UsageDataPoint> inputToken;

    /**
     * 输出Token明细数据。
     */
    public List<UsageDataPoint> outToken;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<UsageDataPoint> getRequest() {
        return this.request;
    }

    public void setRequest(List<UsageDataPoint> request) {
        this.request = request;
    }

    public List<UsageDataPoint> getToken() {
        return this.token;
    }

    public void setToken(List<UsageDataPoint> token) {
        this.token = token;
    }

    public List<UsageDataPoint> getInputToken() {
        return this.inputToken;
    }

    public void setInputToken(List<UsageDataPoint> inputToken) {
        this.inputToken = inputToken;
    }

    public List<UsageDataPoint> getOutToken() {
        return this.outToken;
    }

    public void setOutToken(List<UsageDataPoint> outToken) {
        this.outToken = outToken;
    }

}