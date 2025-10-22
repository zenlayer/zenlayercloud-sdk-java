package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述自动快照策略的相关信息。
 */
public class AutoSnapshotPolicy extends TeaModel {


    /**
     * 自动快照策略ID
     */
    public String autoSnapshotPolicyId;

    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 自动快照策略的名称
     */
    public String autoSnapshotPolicyName;

    /**
     * 自动快照的重复日期。
     * 单位为天，周期为星期，例如 1 表示周一
     */
    public List<Integer> repeatWeekDays;

    /**
     * 指定定期快照策略的触发时间。
     * 使用 UTC 时间，单位为小时。
     * 00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推
     */
    public List<Integer> hours;

    /**
     * 自动快照的保留时间，单位为天。
     * 如果该值设置-1，则代表永久保留。
     * 取值范围：-1或[1,65535]
     */
    public Integer retentionDays;

    /**
     * 关联的云盘数量
     */
    public Integer diskNum;

    /**
     * 策略创建时间
     */
    public String createTime;

    /**
     * 资源组信息
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 关联的云盘ID
     */
    public List<String> diskIdSet;

    /**
     * tags
     */
    public Tags tags;

    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
    }

    public List<Integer> getRepeatWeekDays() {
        return this.repeatWeekDays;
    }

    public void setRepeatWeekDays(List<Integer> repeatWeekDays) {
        this.repeatWeekDays = repeatWeekDays;
    }

    public List<Integer> getHours() {
        return this.hours;
    }

    public void setHours(List<Integer> hours) {
        this.hours = hours;
    }

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public Integer getDiskNum() {
        return this.diskNum;
    }

    public void setDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
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

    public List<String> getDiskIdSet() {
        return this.diskIdSet;
    }

    public void setDiskIdSet(List<String> diskIdSet) {
        this.diskIdSet = diskIdSet;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}