package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CancelInstanceTrafficPackageDowngradeRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}