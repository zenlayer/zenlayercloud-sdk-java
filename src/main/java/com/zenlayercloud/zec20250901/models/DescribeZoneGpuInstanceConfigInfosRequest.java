package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeZoneGpuInstanceConfigInfosRequest extends TeaModel {


    /**
     * 要查询的可用区ID。
     * 例如：na-us-la-2a。
     * 不传时返回所有可用区的GPU规格。
     * 可通过调用 ~~DescribeZones~~ 获取。
     */
    public String zoneId;

    /**
     * 要查询的GPU规格ID。
     * 例如：z3a.g.C49.c8m32.1。
     * 不传时返回所有规格。
     */
    public String instanceType;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

}