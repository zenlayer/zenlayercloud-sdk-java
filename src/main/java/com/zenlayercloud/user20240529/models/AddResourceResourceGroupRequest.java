package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AddResourceResourceGroupRequest extends TeaModel {


    /**
     * 资源ID列表。
     */
    public List<String> resources;

    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    public List<String> getResources() {
        return this.resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}