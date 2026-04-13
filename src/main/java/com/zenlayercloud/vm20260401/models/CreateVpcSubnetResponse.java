package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateVpcSubnetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 子网的ID。
     */
    public String subnetId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}