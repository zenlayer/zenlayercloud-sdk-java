package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询可用区售卖的机型信息请求信息。
 */
public class DescribeZoneInstanceConfigInfosRequest extends TeaModel {


    /**
     * 要查询的可用区ID。
     * 例如：asia-east-1a
     */
    public String zoneId;

    /**
     * 要查询的实例规格。
     * 例如：z2a.cpu.1
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