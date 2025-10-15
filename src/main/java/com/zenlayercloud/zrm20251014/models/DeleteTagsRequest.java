package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 批量删除标签的请求参数。
 */
public class DeleteTagsRequest extends TeaModel {


    /**
     * 需要删除的标签
     */
    public List<Tag> tags;

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}