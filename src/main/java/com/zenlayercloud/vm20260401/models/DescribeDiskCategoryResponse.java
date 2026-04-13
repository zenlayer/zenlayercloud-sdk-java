package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeDiskCategoryResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 云硬盘类型与可用区关系结果集。
     */
    public List<DiskCategory> categoryZoneSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DiskCategory> getCategoryZoneSet() {
        return this.categoryZoneSet;
    }

    public void setCategoryZoneSet(List<DiskCategory> categoryZoneSet) {
        this.categoryZoneSet = categoryZoneSet;
    }

}