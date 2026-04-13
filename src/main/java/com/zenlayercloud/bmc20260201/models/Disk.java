package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 硬盘块信息。
 */
public class Disk extends TeaModel {


    /**
     * 硬盘的大小。
     * 单位：GB。
     */
    public Integer diskSize;

    /**
     * 该硬盘大小的硬盘的数量。
     */
    public Integer diskCount;

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Integer getDiskCount() {
        return this.diskCount;
    }

    public void setDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
    }

}