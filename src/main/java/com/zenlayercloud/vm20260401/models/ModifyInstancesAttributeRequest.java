package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyInstancesAttributeRequest extends TeaModel {


    /**
     * 一个或多个待操作的实例ID。
     */
    public List<String> instanceIds;

    /**
     * 实例名称。
     */
    public String instanceName;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

}