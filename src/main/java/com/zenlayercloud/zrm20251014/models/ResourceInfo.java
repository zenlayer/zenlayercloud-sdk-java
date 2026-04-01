package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述资源的基本信息
 */
public class ResourceInfo extends TeaModel {


    /**
     * 资源类型。
     */
    public String resourceType;

    /**
     * 资源唯一标识。
     */
    public String resourceUuid;

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }

}