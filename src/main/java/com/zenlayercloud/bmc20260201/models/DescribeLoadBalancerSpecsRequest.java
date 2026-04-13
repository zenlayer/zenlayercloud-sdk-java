package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeLoadBalancerSpecsRequest extends TeaModel {


    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月 POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 可用区的节点ID。
     */
    public String zoneId;

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}