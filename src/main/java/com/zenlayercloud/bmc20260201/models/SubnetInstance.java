package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Subnet Instance信息。
 */
public class SubnetInstance extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 私网IP。
     */
    public String privateIpAddress;

    /**
     * 私网IP与实例的绑定状态。
     */
    public String privateIpStatus;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getPrivateIpStatus() {
        return this.privateIpStatus;
    }

    public void setPrivateIpStatus(String privateIpStatus) {
        this.privateIpStatus = privateIpStatus;
    }

}