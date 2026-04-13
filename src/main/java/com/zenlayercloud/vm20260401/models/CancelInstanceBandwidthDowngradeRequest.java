package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CancelInstanceBandwidthDowngradeRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     */
    public String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}