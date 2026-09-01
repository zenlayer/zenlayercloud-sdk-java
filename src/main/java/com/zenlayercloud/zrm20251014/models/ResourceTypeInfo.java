package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述资源类型的基本信息
 */
public class ResourceTypeInfo extends TeaModel {


    /**
     * 资源类型。
     */
    public String resourceType;

    /**
     * 资源类型名称。
     */
    public String name;

    /**
     * 资源类型所属的服务。
     */
    public String service;

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

}