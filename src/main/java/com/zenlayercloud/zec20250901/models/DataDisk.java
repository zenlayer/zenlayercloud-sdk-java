package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述了数据盘的信息。
 */
public class DataDisk extends TeaModel {


    /**
     * 数据盘ID。
     * 该参数仅作为 ~~DescribeInstances~~ 等查询类接口的返回参数，不可用于 ~~CreateZecInstances~~ 等写接口的入参。
     */
    public String diskId;

    /**
     * 云盘的名称。
     * 该参数仅作为 ~~DescribeInstances~~ 等查询类接口的返回参数。
     */
    public String diskName;

    /**
     * 数据盘大小。
     * 单位：GiB。
     */
    public Integer diskSize;

    /**
     * 数据盘数量。
     * 该参数仅用于 ~~CreateZecInstances~~、~~InquiryPriceCreateInstance~~ 等接口的入参。
     */
    public Integer diskAmount;

    /**
     * 云硬盘是否可卸载。
     * 该参数仅作为查询类接口的返回参数，不用于入参。
     * `true`：不随实例删除而删除；`false`：随实例删除而删除。
     */
    public Boolean portable;

    /**
     * 是否开启性能突发。
     */
    public Boolean burstingEnabled;

    /**
     * 云硬盘种类。
     * Basic NVMe SSD: 经济型NVMe SSD。
     * Standard NVMe SSD: 标准型NVMe SSD。
     */
    public String diskCategory;

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

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Integer getDiskAmount() {
        return this.diskAmount;
    }

    public void setDiskAmount(Integer diskAmount) {
        this.diskAmount = diskAmount;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public void setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}