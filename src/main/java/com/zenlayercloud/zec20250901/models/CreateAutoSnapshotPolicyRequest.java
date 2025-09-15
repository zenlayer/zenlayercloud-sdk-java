package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述创建自动快照策略的请求信息。
 */
public class CreateAutoSnapshotPolicyRequest extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 自动快照策略的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
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
     * 默认为永久保存
     */
    public Integer retentionDays;

    /**
     * 资源组ID
     */
    public String resourceGroupId;

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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}