package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改资源的标签的请求参数。
 */
public class ModifyResourceTagsRequest extends TeaModel {


    /**
     * 需要绑定的资源唯一标识
     */
    public String resourceUuid;

    /**
     * 需要更新的标签列表，包含标签键和值
     */
    public List<Tag> replaceTags;

    /**
     * 需要解绑的标签列表，包含标签键
     */
    public List<String> deleteTagKeys;

    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }

    public List<Tag> getReplaceTags() {
        return this.replaceTags;
    }

    public void setReplaceTags(List<Tag> replaceTags) {
        this.replaceTags = replaceTags;
    }

    public List<String> getDeleteTagKeys() {
        return this.deleteTagKeys;
    }

    public void setDeleteTagKeys(List<String> deleteTagKeys) {
        this.deleteTagKeys = deleteTagKeys;
    }

}