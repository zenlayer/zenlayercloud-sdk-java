package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述带宽包里的资源信息。
 */
public class BandwidthClusterResource extends TeaModel {


    /**
     * 资源ID
     */
    public String resourceId;

    /**
     * 资源类型
     */
    public String resourceType;

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

}