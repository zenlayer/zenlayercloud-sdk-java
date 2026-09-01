package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述资源的基本信息
 */
public class ResourceSearchInfo extends TeaModel {


    /**
     * 资源唯一标识。
     */
    public String resourceId;

    /**
     * 资源名称。
     */
    public String name;

    /**
     * 资源类型。
     * 取值见 ~~DescribeResourceTypes~~。
     */
    public String resourceType;

    /**
     * 资源创建时间。
     */
    public String createTime;

    /**
     * 资源组唯一标识。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 资源所属的地域信息。
     */
    public String location;

    /**
     * 资源所属的服务。
     */
    public String service;

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

}