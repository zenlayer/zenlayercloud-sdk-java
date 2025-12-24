package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 标签分页列表的请求参数。
 */
public class DescribeTagsRequest extends TeaModel {


    /**
     * 页码，默认值1
     */
    public Integer pageNum;

    /**
     * 每页面展示数量，默认值20
     */
    public Integer pageSize;

    /**
     * 标签键排序方式：ascend（正序），descend（倒序）
     */
    public String keySort;

    /**
     * 创建时间排序方式：ascend（正序），descend（倒序）。
     * 默认倒序
     */
    public String createdDateSort;

    /**
     * 筛选的标签键集合
     */
    public List<String> tagKeys;

    /**
     * 筛选的标签集合
     */
    public List<Tag> tags;

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeySort() {
        return this.keySort;
    }

    public void setKeySort(String keySort) {
        this.keySort = keySort;
    }

    public String getCreatedDateSort() {
        return this.createdDateSort;
    }

    public void setCreatedDateSort(String createdDateSort) {
        this.createdDateSort = createdDateSort;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}