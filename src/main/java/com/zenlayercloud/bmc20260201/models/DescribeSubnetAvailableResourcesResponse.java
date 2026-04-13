package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSubnetAvailableResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * zone结果集。
     */
    public List<String> zoneIdSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getZoneIdSet() {
        return this.zoneIdSet;
    }

    public void setZoneIdSet(List<String> zoneIdSet) {
        this.zoneIdSet = zoneIdSet;
    }

}