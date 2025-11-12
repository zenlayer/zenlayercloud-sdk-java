package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

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
