package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DescribeZoneInstanceConfigInfosRequest extends TeaModel {


    /**
     * 实例计费类型。
     * PREPAID：预付费。
     * POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 实例机型。
     */
    public String instanceType;

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

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