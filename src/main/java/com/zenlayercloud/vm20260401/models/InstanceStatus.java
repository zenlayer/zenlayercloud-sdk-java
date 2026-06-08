package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述实例的状态。
 */
public class InstanceStatus extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 实例状态。
     */
    public String instanceStatus;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

}