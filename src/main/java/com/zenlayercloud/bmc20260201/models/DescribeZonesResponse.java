package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeZonesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区列表。
     */
    public List<Zone> zoneSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Zone> getZoneSet() {
        return this.zoneSet;
    }

    public void setZoneSet(List<Zone> zoneSet) {
        this.zoneSet = zoneSet;
    }

}