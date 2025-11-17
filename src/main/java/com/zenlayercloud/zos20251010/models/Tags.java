package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述资源关联的标签信息。
 */
public class Tags extends TeaModel {


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