package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 节点列表。
     */
    public List<RegionItem> regionSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<RegionItem> getRegionSet() {
        return this.regionSet;
    }

    public void setRegionSet(List<RegionItem> regionSet) {
        this.regionSet = regionSet;
    }

}