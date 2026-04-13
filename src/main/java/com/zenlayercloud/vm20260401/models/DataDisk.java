package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 数据盘的基本信息。
 */
public class DataDisk extends TeaModel {


    /**
     * 磁盘ID。
     */
    public String diskId;

    /**
     * 磁盘名称。
     */
    public String diskName;

    /**
     * 数据盘大小，单位GB。
     */
    public Integer diskSize;

    /**
     * 数据盘数量。
     */
    public Integer diskAmount;

    /**
     * 是否可拔插。
     */
    public Boolean portable;

    /**
     * 磁盘种类。
     * STANDARD：标准云盘。
     * SSD：固态硬盘。
     * 默认为SSD。
     */
    public String diskCategory;

    /**
     * 数据盘价格。
     */
    public PriceItem diskPrice;

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

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    public PriceItem getDiskPrice() {
        return this.diskPrice;
    }

    public void setDiskPrice(PriceItem diskPrice) {
        this.diskPrice = diskPrice;
    }

}