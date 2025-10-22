package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述创建资源时同时绑定的标签对的信息。
 */
public class TagAssociation extends TeaModel {


    /**
     * 标签对列表
     */
    public List<Tag> tags;

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}