package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ReleaseInstancesRequest extends TeaModel {


    /**
     * 要释放的实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * 释放实例时是否同步释放关联资源。
     * true：同步释放（默认）；false：仅释放实例本身，关联资源保留。
     */
    public Boolean dependResource;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public Boolean getDependResource() {
        return this.dependResource;
    }

    public void setDependResource(Boolean dependResource) {
        this.dependResource = dependResource;
    }

}