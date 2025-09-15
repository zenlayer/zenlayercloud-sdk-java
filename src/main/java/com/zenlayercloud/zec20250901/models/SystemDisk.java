package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述系统盘的基本信息。
 */
public class SystemDisk extends TeaModel {


    /**
     * 系统盘ID。
     * 该参数目前仅用于`DescribeInstances`等查询类接口的返回参数，不可用于`CreateInstances`等写接口的入参
     */
    public String diskId;

    /**
     * 系统盘大小。
     * 单位：GiB
     */
    public Integer diskSize;

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

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}