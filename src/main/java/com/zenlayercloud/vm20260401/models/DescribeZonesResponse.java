package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeZonesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 区域信息集合。
     */
    public List<ZoneInfo> zoneSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ZoneInfo> getZoneSet() {
        return this.zoneSet;
    }

    public void setZoneSet(List<ZoneInfo> zoneSet) {
        this.zoneSet = zoneSet;
    }

}