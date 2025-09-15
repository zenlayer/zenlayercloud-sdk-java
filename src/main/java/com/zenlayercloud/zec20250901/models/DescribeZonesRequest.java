package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询可用区的请求信息。
 */
public class DescribeZonesRequest extends TeaModel {


    /**
     * 根据可用区ID过滤
     */
    public List<String> zoneIds;

    public List<String> getZoneIds() {
        return this.zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

}