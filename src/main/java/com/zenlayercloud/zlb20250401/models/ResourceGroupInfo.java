package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述资源所在资源组的相关信息，包括资源组名称和ID。
 */
public class ResourceGroupInfo extends TeaModel {


    /**
     * 资源组ID
     */
    public String resourceGroupId;

    /**
     * 资源组名称
     */
    public String resourceGroupName;

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

}