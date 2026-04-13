package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImageQuotaRequest extends TeaModel {


    /**
     * 可用区ID列表。
     * 可从DescribeZones的zoneId中获取。
     */
    public List<String> zoneIds;

    public List<String> getZoneIds() {
        return this.zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

}