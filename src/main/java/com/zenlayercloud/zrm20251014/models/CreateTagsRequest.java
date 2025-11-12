package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 批量创建标签的请求参数。
 */
public class CreateTagsRequest extends TeaModel {


    /**
     * 创建的标签。
     * 一次性最多创建20个标签
     */
    public List<Tag> tags;

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}