package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSnapshotsRequest extends TeaModel {


    /**
     */
    public List<String> snapshotIds;

    /**
     * 快照所属的可用区ID
     */
    public String zoneId;

    /**
     * 根据快照的状态过滤
     */
    public String status;

    /**
     * 按照快照所属的Disk ID列表 过滤
     */
    public List<String> diskIds;

    /**
     * 根据快照的云盘类型过滤
     */
    public String diskType;

    /**
     * 根据快照显示名称过滤。
     * 该字段支持模糊搜索
     */
    public String snapshotName;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    /**
     * 根据资源组ID过滤
     */
    public String resourceGroupId;

    public List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public void setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
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