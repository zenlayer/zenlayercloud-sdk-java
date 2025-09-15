package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述可用区支持的云盘类型的信息。
 */
public class DescribeDiskCategoryItem extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 支持的云硬盘类型
     */
    public List<String> categorySet;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<String> getCategorySet() {
        return this.categorySet;
    }

    public void setCategorySet(List<String> categorySet) {
        this.categorySet = categorySet;
    }

}