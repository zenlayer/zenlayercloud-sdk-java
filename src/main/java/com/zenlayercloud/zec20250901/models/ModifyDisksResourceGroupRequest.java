package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyDisksResourceGroupRequest extends TeaModel {


    /**
     * 要迁移资源组的云盘ID列表。
     */
    public List<String> diskIds;

    /**
     * 目标资源组ID。
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