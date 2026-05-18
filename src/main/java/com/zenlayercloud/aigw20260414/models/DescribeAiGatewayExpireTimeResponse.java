package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeAiGatewayExpireTimeResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 过期类型。
     */
    public String expireType;

    /**
     * 过期时间。
     */
    public String expireTime;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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