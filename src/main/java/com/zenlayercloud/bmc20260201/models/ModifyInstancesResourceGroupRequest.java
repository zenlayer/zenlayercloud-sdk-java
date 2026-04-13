package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyInstancesResourceGroupRequest extends TeaModel {


    /**
     * 实例ID列表。
     * 每次请求允许操作的实例数量上限是100。
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