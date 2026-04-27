package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteResourceGroupRequest extends TeaModel {


    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}