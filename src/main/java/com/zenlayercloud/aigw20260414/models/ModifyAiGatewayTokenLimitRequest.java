package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyAiGatewayTokenLimitRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

    /**
     * Token限制（访问限制）。
     */
    public Integer tokenLimit;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public Integer getTokenLimit() {
        return this.tokenLimit;
    }

    public void setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

}