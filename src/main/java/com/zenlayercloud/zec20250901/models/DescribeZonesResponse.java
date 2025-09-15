package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询可用区
 */
public class DescribeZonesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区列表
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