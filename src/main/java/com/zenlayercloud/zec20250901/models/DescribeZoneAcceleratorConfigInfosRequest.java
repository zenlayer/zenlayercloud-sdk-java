package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeZoneAcceleratorConfigInfosRequest extends TeaModel {


    /**
     * 要查询的可用区 ID。
     * 例如：na-us-la-2a。
     * 不传时返回所有可用区的加速卡规格。
     */
    public String zoneId;

    /**
     * 要查询的加速卡规格 ID。
     * 例如：z2a.v.T1U.c16m64.1。
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