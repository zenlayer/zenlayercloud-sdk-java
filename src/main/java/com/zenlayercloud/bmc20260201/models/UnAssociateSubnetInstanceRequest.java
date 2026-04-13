package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class UnAssociateSubnetInstanceRequest extends TeaModel {


    /**
     * Subnet的ID。
     */
    public String subnetId;

    /**
     * 实例的ID。
     */
    public String instanceId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}