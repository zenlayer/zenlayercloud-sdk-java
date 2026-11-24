package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeLocalDiskSpecsRequest extends TeaModel {


    /**
     * 可用区ID。
     * 可通过调用 **DescribeZones** 获取。
     */
    public String zoneId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}