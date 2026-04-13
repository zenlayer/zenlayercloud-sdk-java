package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateVpcResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * vpc的ID。
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