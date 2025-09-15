package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建子网的响应结果。
 */
public class CreateSubnetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的子网ID
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