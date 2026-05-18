package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiModelsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * AI网关模型。
     */
    public List<AiModel> modelSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AiModel> getModelSet() {
        return this.modelSet;
    }

    public void setModelSet(List<AiModel> modelSet) {
        this.modelSet = modelSet;
    }

}