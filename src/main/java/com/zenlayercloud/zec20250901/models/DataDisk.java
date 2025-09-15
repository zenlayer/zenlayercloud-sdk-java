package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述了数据盘的信息。
 */
public class DataDisk extends TeaModel {


    /**
     * 数据盘ID。
     * 该参数目前仅用于`DescribeInstances`等查询类接口的返回参数，不可用于`CreateInstances`等写接口的入参
     */
    public String diskId;

    /**
     * 云盘的名称。
     * 该参数目前仅用于DescribeInstances等查询类接口的返回参数
     */
    public String diskName;

    /**
     * 数据盘大小。
     * 单位：GiB
     */
    public Integer diskSize;

    /**
     * 数据盘数量。
     * 该参数仅用于`CreateInstances`,`InquiryPriceCreateInstance`等接口的入参使用
     */
    public Integer diskAmount;

    /**
     * 是否可拆卸。
     * 该参数仅用于查询的回参，不用于入参。
     * true代表不会随着实例删除而删除。
     * false代表会随着实例删除而删除
     */
    public Boolean portable;

    /**
     * 云硬盘种类。
     * Basic NVMe SSD: 经济型 NVMe SSD。
     * Standard NVMe SSD: 标准型 NVMe SSD。
     * 默认为Standard NVMe SSD
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

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}