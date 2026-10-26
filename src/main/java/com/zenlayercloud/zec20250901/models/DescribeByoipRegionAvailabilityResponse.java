package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeByoipRegionAvailabilityResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 区域的BYOIP支持情况列表。
     */
    public List<ByoipRegionAvailability> regions;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ByoipRegionAvailability> getRegions() {
        return this.regions;
    }

    public void setRegions(List<ByoipRegionAvailability> regions) {
        this.regions = regions;
    }

}