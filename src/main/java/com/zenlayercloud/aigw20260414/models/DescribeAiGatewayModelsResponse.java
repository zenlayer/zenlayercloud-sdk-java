package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiGatewayModelsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 关联模型列表。
     */
    public List<AiGatewayModel> models;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AiGatewayModel> getModels() {
        return this.models;
    }

    public void setModels(List<AiGatewayModel> models) {
        this.models = models;
    }

}