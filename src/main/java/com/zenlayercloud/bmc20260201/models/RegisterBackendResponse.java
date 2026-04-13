package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class RegisterBackendResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 后端配置服务器的ID。
     */
    public String backendId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getBackendId() {
        return this.backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }

}