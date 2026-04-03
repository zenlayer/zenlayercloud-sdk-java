package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述置放组的详细信息。
 */
public class PlacementGroupInfo extends TeaModel {


    /**
     * 置放组ID。
     */
    public String placementGroupId;

    /**
     * 置放组名称。
     */
    public String name;

    /**
     * 置放组所属可用区ID。
     */
    public String zoneId;

    /**
     * 置放组的分区数。
     * 取值范围为2到5，决定置放组最大可关联实例数。
     */
    public Integer partitionNum;

    /**
     * 置放组的亲和度。
     * 取值范围为1到分区数向下取整除以2。
     */
    public Integer affinity;

    /**
     * 置放组内的实例数量。
     */
    public Integer instanceCount;

    /**
     * 置放组内关联的实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * 置放组约束满足状态。
     */
    public String constraintStatus;

    /**
     * 置放组的创建时间。
     */
    public String createTime;

    /**
     * 置放组所属的资源组信息。
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 置放组的标签。
     */
    public Tags tags;

    public String getPlacementGroupId() {
        return this.placementGroupId;
    }

    public void setPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
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

    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public void setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
    }

    public Integer getAffinity() {
        return this.affinity;
    }

    public void setAffinity(Integer affinity) {
        this.affinity = affinity;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getConstraintStatus() {
        return this.constraintStatus;
    }

    public void setConstraintStatus(String constraintStatus) {
        this.constraintStatus = constraintStatus;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}