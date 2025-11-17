package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 区域封禁可选区域列表
 */
public class DescribePolicyRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 区域可选列表
     */
    public List<PolicyRegion> regions;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PolicyRegion> getRegions() {
        return this.regions;
    }

    public void setRegions(List<PolicyRegion> regions) {
        this.regions = regions;
    }

}