package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建全球VPC的响应结果。
 */
public class CreateVpcResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的VPC ID
     */
    public String vpcId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}