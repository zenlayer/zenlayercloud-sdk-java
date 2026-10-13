package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeByoAsnsRequest extends TeaModel {


    /**
     * BYO ASN的ID列表。
     * 最多支持100个ID查询。
     */
    public List<String> byoAsnIds;

    /**
     * 根据ASN号进行精确过滤。
     */
    public Long asn;

    /**
     * 根据状态进行过滤。
     */
    public String status;

    /**
     * 根据资源组ID进行过滤。
     */
    public String resourceGroupId;

    /**
     * 排序字段。
     * 未指定时按创建时间排序。
     */
    public String orderBy;

    /**
     * 排序方向。
     * 未指定时为降序。
     */
    public String direction;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键。
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签。
     */
    public List<Tag> tags;

    public List<String> getByoAsnIds() {
        return this.byoAsnIds;
    }

    public void setByoAsnIds(List<String> byoAsnIds) {
        this.byoAsnIds = byoAsnIds;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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