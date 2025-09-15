package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建云硬盘询价的请求参数。
 */
public class InquiryPriceCreateDisksRequest extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 云硬盘大小。
     * 单位：GiB
     */
    public Integer diskSize;

    /**
     * 云硬盘数量
     */
    public Integer diskAmount;

    /**
     * 云硬盘种类。
     * Basic NVMe SSD: 经济型 NVMe SSD。
     * Standard NVMe SSD: 标准型 NVMe SSD。
     * 默认为Standard NVMe SSD
     */
    public String diskCategory;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}