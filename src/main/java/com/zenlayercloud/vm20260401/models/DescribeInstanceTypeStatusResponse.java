package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceTypeStatusResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 虚拟机实例ID。
     */
    public String instanceId;

    /**
     * 实例的名称。
     */
    public String instanceName;

    /**
     * 当前实例的机型。
     */
    public String instanceType;

    /**
     * 实例将要修改的机型。
     */
    public String modifiedInstanceType;

    /**
     * 实例机型状态。
     * Processing：变更中。
     * Enable：可用。
     * WaitToEnable：下周期变更。
     */
    public String modifiedInstanceTypeStatus;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getModifiedInstanceType() {
        return this.modifiedInstanceType;
    }

    public void setModifiedInstanceType(String modifiedInstanceType) {
        this.modifiedInstanceType = modifiedInstanceType;
    }

    public String getModifiedInstanceTypeStatus() {
        return this.modifiedInstanceTypeStatus;
    }

    public void setModifiedInstanceTypeStatus(String modifiedInstanceTypeStatus) {
        this.modifiedInstanceTypeStatus = modifiedInstanceTypeStatus;
    }

}