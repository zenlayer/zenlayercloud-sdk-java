package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更实例规格的请求参数。
 */
public class ModifyInstanceTypeRequest extends TeaModel {


    /**
     * 要变更的实例ID
     */
    public String instanceId;

    /**
     * 变更的目标实例规格
     */
    public String instanceType;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

}