package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiUsageDataResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 总输入token数。
     */
    public Long totalInputTokens;

    /**
     * 总输出token数。
     */
    public Long totalOutputTokens;

    /**
     * 实例模型用量数据。
     */
    public List<UsageData> instanceModelToken;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Long getTotalInputTokens() {
        return this.totalInputTokens;
    }

    public void setTotalInputTokens(Long totalInputTokens) {
        this.totalInputTokens = totalInputTokens;
    }

    public Long getTotalOutputTokens() {
        return this.totalOutputTokens;
    }

    public void setTotalOutputTokens(Long totalOutputTokens) {
        this.totalOutputTokens = totalOutputTokens;
    }

    public List<UsageData> getInstanceModelToken() {
        return this.instanceModelToken;
    }

    public void setInstanceModelToken(List<UsageData> instanceModelToken) {
        this.instanceModelToken = instanceModelToken;
    }

}