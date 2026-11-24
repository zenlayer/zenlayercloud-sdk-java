package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述了一种可售的本地盘规格。
 */
public class LocalDiskSpec extends TeaModel {


    /**
     * 本地盘种类。
     * 创建实例或询价时作为`localDisks.diskCategory`传入。
     */
    public String diskCategory;

    /**
     * 本地盘大小。
     * 单位：GiB。
     * 本地盘只能按固定容量档位购买，创建实例或询价时作为`localDisks.diskSize`传入。
     */
    public Integer diskSize;

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

}