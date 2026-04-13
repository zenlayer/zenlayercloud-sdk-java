package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ModifyInstanceTypeRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     */
    public String instanceId;

    /**
     * 要更换的机型ID。
     */
    public String instanceTypeId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

}