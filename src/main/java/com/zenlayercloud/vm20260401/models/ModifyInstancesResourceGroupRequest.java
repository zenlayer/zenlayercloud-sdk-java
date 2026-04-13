package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyInstancesResourceGroupRequest extends TeaModel {


    /**
     * 虚拟机实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}