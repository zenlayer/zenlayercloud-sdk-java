package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeResourceTypesRequest extends TeaModel {


    /**
     * 按所属服务筛选，精确匹配，多个服务之间为或的关系。
     * 不传时返回全部服务的资源类型。
     */
    public List<String> services;

    /**
     * 按资源类型筛选，精确匹配，多个类型之间为或的关系。
     * 不传时返回全部资源类型。
     */
    public List<String> resourceTypes;

    public List<String> getServices() {
        return this.services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

}