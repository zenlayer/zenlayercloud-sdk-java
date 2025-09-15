package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class StartIpForwardRequest extends TeaModel {


    /**
     * 要操作的实例ID
     */
    public String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}