package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述公网IP池的请求参数。
 */
public class DescribePoolsRequest extends TeaModel {


    /**
     * 根据公网IP池的ID
     */
    public List<String> poolIds;

    /**
     * 根据公网IP池的所在节点ID过滤
     */
    public String regionId;

    /**
     * 根据公网IP池的名称过滤。
     * 支持模糊查询
     */
    public String name;

    /**
     * 返回的分页大小，默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    public List<String> getPoolIds() {
        return this.poolIds;
    }

    public void setPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

}