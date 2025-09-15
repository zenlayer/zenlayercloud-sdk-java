package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询云硬盘支持的类型的请求信息。
 */
public class DescribeDiskCategoryRequest extends TeaModel {


    /**
     * 根据可用区ID筛选
     */
    public String zoneId;

    /**
     * 根据云硬盘种类筛选。
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

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

}