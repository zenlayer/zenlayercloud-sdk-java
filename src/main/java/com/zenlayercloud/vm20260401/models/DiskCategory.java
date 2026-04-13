package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 云盘类型。
 */
public class DiskCategory extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 该可用区支持的云硬盘种类集合。
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