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
     * 需要绑定的资源唯一标识列表
     */
    public List<String> resourceUuids;

    public Tag getTag() {
        return this.tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public List<String> getResourceUuids() {
        return this.resourceUuids;
    }

    public void setResourceUuids(List<String> resourceUuids) {
        this.resourceUuids = resourceUuids;
    }

}