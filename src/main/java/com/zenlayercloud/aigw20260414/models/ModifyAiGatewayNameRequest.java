package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyAiGatewayNameRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

    /**
     * 网关名称。
     */
    public String gatewayName;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

}