package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateSubnetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * Subnet的ID。
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