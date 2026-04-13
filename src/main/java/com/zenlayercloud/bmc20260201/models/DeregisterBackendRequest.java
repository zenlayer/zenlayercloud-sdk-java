package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DeregisterBackendRequest extends TeaModel {


    /**
     * 后端配置服务器的ID。
     */
    public String backendId;

    public String getBackendId() {
        return this.backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }

}