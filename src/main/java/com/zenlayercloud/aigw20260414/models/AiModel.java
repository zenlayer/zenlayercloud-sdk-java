package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述AI网关模型的信息。包模型uuid、模型名称、模型类型等。
 */
public class AiModel extends TeaModel {


    /**
     * 模型uuid。
     */
    public String modelUuid;

    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 模型类型。
     */
    public String modelType;

    /**
     * 厂商名称。
     */
    public String providerName;

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

    public String getModelType() {
        return this.modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

}