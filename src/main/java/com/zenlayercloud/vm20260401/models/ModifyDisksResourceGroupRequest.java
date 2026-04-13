package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyDisksResourceGroupRequest extends TeaModel {


    /**
     * 云硬盘ID列表。
     * 每次请求允许操作的云硬盘数量上限是100。
     */
    public List<String> diskIds;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}