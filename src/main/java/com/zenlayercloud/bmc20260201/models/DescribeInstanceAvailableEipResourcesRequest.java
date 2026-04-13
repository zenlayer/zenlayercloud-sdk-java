package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceAvailableEipResourcesRequest extends TeaModel {


    /**
     * 机器实例ID 。
     * 可通过DescribeInstances接口返回的instanceId获取。
     */
    public String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}