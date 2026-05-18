package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyAiGatewayModelsRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

    /**
     * 模型访问权限。
     */
    public String modelAccess;

    /**
     * 模型UUID列表。
     */
    public List<String> modelUuids;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public String getModelAccess() {
        return this.modelAccess;
    }

    public void setModelAccess(String modelAccess) {
        this.modelAccess = modelAccess;
    }

    public List<String> getModelUuids() {
        return this.modelUuids;
    }

    public void setModelUuids(List<String> modelUuids) {
        this.modelUuids = modelUuids;
    }

}