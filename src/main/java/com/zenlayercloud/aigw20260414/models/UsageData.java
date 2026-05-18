package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述AI网关模型用量信息。
 */
public class UsageData extends TeaModel {


    /**
     * 模型uuid。
     */
    public String modelUuid;

    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 模型总token数。
     */
    public Long totalTokens;

    /**
     * 模型总request数。
     */
    public Long totalRequests;

    public String getModelUuid() {
        return this.modelUuid;
    }

    public void setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public void setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Long getTotalRequests() {
        return this.totalRequests;
    }

    public void setTotalRequests(Long totalRequests) {
        this.totalRequests = totalRequests;
    }

}