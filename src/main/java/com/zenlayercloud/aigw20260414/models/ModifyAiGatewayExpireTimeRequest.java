package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyAiGatewayExpireTimeRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

    /**
     * 过期类型。
     */
    public String expireType;

    /**
     * 过期时间。
     */
    public String expireTime;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public String getExpireType() {
        return this.expireType;
    }

    public void setExpireType(String expireType) {
        this.expireType = expireType;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

}