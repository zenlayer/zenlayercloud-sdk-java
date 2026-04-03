package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePlacementGroupsRequest extends TeaModel {


    /**
     * 根据置放组ID列表筛选。
     * 最多支持100个ID查询。
     */
    public List<String> placementGroupIds;

    /**
     * 根据置放组名称筛选。
     * 支持模糊匹配。
     */
    public String name;

    /**
     * 根据置放组所属可用区筛选。
     */
    public String zoneId;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 根据资源组ID筛选。
     */
    public String resourceGroupId;

    public List<String> getPlacementGroupIds() {
        return this.placementGroupIds;
    }

    public void setPlacementGroupIds(List<String> placementGroupIds) {
        this.placementGroupIds = placementGroupIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}