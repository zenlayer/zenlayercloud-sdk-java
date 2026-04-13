package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeEipAvailableResourcesRequest extends TeaModel {


    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String eipChargeType;

    /**
     * EIP所属的可用区ID。
     * 不传则查询所有区域可用的EIP。
     */
    public String zoneId;

    public String getEipChargeType() {
        return this.eipChargeType;
    }

    public void setEipChargeType(String eipChargeType) {
        this.eipChargeType = eipChargeType;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}