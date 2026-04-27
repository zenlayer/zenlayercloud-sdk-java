package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述资源组的信息。
 */
public class ResourceGroup extends TeaModel {


    /**
     * 资源组唯一ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String name;

    /**
     * 创建时间。
     */
    public String createTime;

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}