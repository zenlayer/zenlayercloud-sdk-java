package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCommandsRequest extends TeaModel {


    /**
     * 根据命令ID进行筛选。
     * 最长不超过100个
     */
    public List<String> commandIds;

    /**
     * 根据命令名称进行筛选。
     * 该字段支持模糊搜索
     */
    public String name;

    /**
     * 根据命令类型进行筛选
     */
    public List<String> types;

    /**
     * 返回的分页大小，默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签
     */
    public List<Tag> tags;

    public List<String> getCommandIds() {
        return this.commandIds;
    }

    public void setCommandIds(List<String> commandIds) {
        this.commandIds = commandIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return this.types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
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