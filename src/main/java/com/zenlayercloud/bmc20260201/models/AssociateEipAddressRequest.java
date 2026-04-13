package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class AssociateEipAddressRequest extends TeaModel {


    /**
     * 一个EIP ID。
     * 可通过DescribeEipAddresses接口返回值中的eipId获取。
     */
    public String eipId;

    /**
     * 机器实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}