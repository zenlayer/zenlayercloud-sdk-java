package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述了本地盘的信息。
 */
public class LocalDisk extends TeaModel {


    /**
     * 本地盘ID。
     * 该参数仅作为 **DescribeInstances** 等查询类接口的返回参数，不可用于 **CreateZecInstances** 等写接口的入参。
     */
    public String diskId;

    /**
     * 本地盘的名称。
     * 该参数仅作为 **DescribeInstances** 等查询类接口的返回参数。
     */
    public String diskName;

    /**
     * 本地盘大小。
     * 单位：GiB。
     * 只能取可用区支持的固定容量档位，可通过调用 **DescribeLocalDiskSpecs** 获取。
     */
    public Integer diskSize;

    /**
     * 本地盘数量。
     * 该参数仅用于 **CreateZecInstances**、**InquiryPriceCreateInstance** 等接口的入参。
     */
    public Integer diskAmount;

    /**
     * 本地盘种类。
     * 可通过调用 **DescribeLocalDiskSpecs** 获取可用区支持的种类。
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

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}