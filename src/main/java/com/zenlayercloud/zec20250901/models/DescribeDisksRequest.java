package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询云盘列表的请求参数。
 */
public class DescribeDisksRequest extends TeaModel {


    /**
     * 根据云盘ID列表筛选
     */
    public List<String> diskIds;

    /**
     * 根据云盘名称筛选，该字段支持模糊搜索
     */
    public String diskName;

    /**
     * 根据云盘的状态进行筛选
     */
    public String diskStatus;

    /**
     * 根据云盘的类型进行筛选
     */
    public String diskType;

    /**
     * 根据云盘的分类进行筛选
     */
    public String diskCategory;

    /**
     * 根据云盘挂载的实例ID进行筛选
     */
    public String instanceId;

    /**
     * 根据云盘所在的可用区进行筛选
     */
    public String zoneId;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageNum;

    /**
     * 返回的分页数。
     * 默认为1
     */
    public Integer pageSize;

    /**
     * 根据云盘所在的节点ID进行筛选
     */
    public String regionId;

    /**
     * 根据云盘是否有快照能力进行筛选
     */
    public Boolean snapshotAbility;

    /**
     * 根据快照所属的资源组进行筛选
     */
    public String resourceGroupId;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskStatus() {
        return this.diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

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

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Boolean getSnapshotAbility() {
        return this.snapshotAbility;
    }

    public void setSnapshotAbility(Boolean snapshotAbility) {
        this.snapshotAbility = snapshotAbility;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}