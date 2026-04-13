package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateDisksRequest extends TeaModel {


    /**
     * 可用区ID。
     * 可从DescribeZones接口中获取。
     */
    public String zoneId;

    /**
     * 云硬盘大小，单位GB。
     */
    public Integer diskSize;

    /**
     * 云硬盘数量。
     * 最小值与默认值均为1，最大值50。
     */
    public Integer diskAmount;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 若指定云硬盘的付费类型为预付费则该参数必传。
     */
    public ChargePrepaid chargePrepaid;

    /**
     * 云硬盘种类。
     * STANDARD：标准云盘。
     * SSD：固态硬盘。
     * 默认为SSD。
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

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public ChargePrepaid getChargePrepaid() {
        return this.chargePrepaid;
    }

    public void setChargePrepaid(ChargePrepaid chargePrepaid) {
        this.chargePrepaid = chargePrepaid;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}