package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述防护策略列表的请求参数。
 */
public class DescribePolicysRequest extends TeaModel {


    /**
     * 根据防护策略ID列表进行筛选。
     * 最大不能超过100个
     */
    public List<String> policyIds;

    /**
     * 根据防护策略名称过滤。
     * 该字段支持模糊搜索
     */
    public String policyName;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
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

    public List<String> getPolicyIds() {
        return this.policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
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