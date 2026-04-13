package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DescribeDiskCategoryRequest extends TeaModel {


    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 可用区ID。
     * 可从DescribeZones接口中获取。
     */
    public String zoneId;

    /**
     * 云硬盘种类。
     * STANDARD：标准云盘。
     * SSD：固态硬盘。
     */
    public String diskCategory;

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}