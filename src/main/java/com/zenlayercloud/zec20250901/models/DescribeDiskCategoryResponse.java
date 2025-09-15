package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 获取某个区域支持的云盘类型响应结果。
 */
public class DescribeDiskCategoryResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区支持的云盘类型
     */
    public List<DescribeDiskCategoryItem> categoryZoneSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DescribeDiskCategoryItem> getCategoryZoneSet() {
        return this.categoryZoneSet;
    }

    public void setCategoryZoneSet(List<DescribeDiskCategoryItem> categoryZoneSet) {
        this.categoryZoneSet = categoryZoneSet;
    }

}