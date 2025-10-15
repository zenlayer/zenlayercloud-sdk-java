package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 标签批量绑定资源的请求参数。
 */
public class TagBindResourcesRequest extends TeaModel {


    /**
     * 标签，包含标签键和值
     */
    public Tag tag;

    /**
     * 需要绑定的资源列表
     */
    public List<Resource> resources;

    public Tag getTag() {
        return this.tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

}