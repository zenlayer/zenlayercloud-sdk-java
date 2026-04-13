package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 云硬盘信息。
 */
public class DiskInfo extends TeaModel {


    /**
     * 云硬盘ID。
     */
    public String diskId;

    /**
     * 云硬盘名称。
     */
    public String diskName;

    /**
     * 云盘所属区域。
     */
    public String zoneId;

    /**
     * 云盘类型。
     * SYSTEM：系统盘。
     * DATA：数据盘。
     */
    public String diskType;

    /**
     * 是否可拔插。
     */
    public Boolean portable;

    /**
     * 云硬盘种类。
     * STANDARD：标准云盘。
     * SSD：固态硬盘。
     */
    public String diskCategory;

    /**
     * 云盘大小，单位GB。
     */
    public Integer diskSize;

    /**
     * 云盘状态。
     */
    public String diskStatus;

    /**
     * 所绑定的实例ID。
     */
    public String instanceId;

    /**
     * 所绑定的实例名字。
     */
    public String instanceName;

    /**
     * 付费类型。
     * PREPAID：预付费。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String expiredTime;

    /**
     * 购买实例的时长，单位：月。
     * 后付费实例该字段为null。
     */
    public Integer period;

    /**
     * 是否自动续费。
     * 对于预付费实例，取消订阅后，该字段值将返回false。
     */
    public Boolean autoRenew;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskStatus() {
        return this.diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}