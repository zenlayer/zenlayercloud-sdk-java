package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 标签批量解绑资源的请求参数。
 */
public class TagUnbindResourcesRequest extends TeaModel {


    /**
     * 标签，包含标签键和值
     */
    public Tag tag;

    /**
     * 需要解绑的资源唯一标识列表
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