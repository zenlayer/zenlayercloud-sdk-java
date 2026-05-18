package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class StopAiGatewayRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

}