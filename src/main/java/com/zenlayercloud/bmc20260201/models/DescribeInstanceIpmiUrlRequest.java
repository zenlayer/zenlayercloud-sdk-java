package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceIpmiUrlRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}