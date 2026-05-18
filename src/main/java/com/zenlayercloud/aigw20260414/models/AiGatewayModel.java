package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述AI网关关联模型的信息。包模型uuid和模型名称。
 */
public class AiGatewayModel extends TeaModel {


    /**
     * 模型uuid。
     */
    public String modelUuid;

    /**
     * 模型名称。
     */
    public String modelName;

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

}