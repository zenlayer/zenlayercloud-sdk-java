package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyResourceGroupRequest extends TeaModel {


    /**
     * 资源组名称。
     */
    public String name;

    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}