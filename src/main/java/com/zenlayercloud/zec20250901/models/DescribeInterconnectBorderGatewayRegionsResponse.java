package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInterconnectBorderGatewayRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 互联节点列表。
     */
    public List<InterconnectRegion> regionSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InterconnectRegion> getRegionSet() {
        return this.regionSet;
    }

    public void setRegionSet(List<InterconnectRegion> regionSet) {
        this.regionSet = regionSet;
    }

}