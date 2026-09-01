package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeResourcesRequest extends TeaModel {


    /**
     * 页码，默认值1。
     */
    public Integer pageNum;

    /**
     * 每页面展示数量，默认值20。
     */
    public Integer pageSize;

    /**
     * 资源唯一标识列表，精确匹配，多个标识之间为或的关系。
     */
    public List<String> resourceIds;

    /**
     * 资源名称，模糊匹配。
     */
    public String resourceName;

    /**
     * 资源组唯一标识列表，精确匹配，为空代表查询所有资源组。
     */
    public String resourceGroupId;

    /**
     * 查询的标签列表。
     */
    public List<Tag> tags;

    /**
     * 查询的标签键列表。
     */
    public List<String> tagKeys;

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

    public List<String> getResourceIds() {
        return this.resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

}