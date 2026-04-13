package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeLoadBalancerZonesRequest extends TeaModel {


    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月 POSTPAID：后付费。
     */
    public String chargeType;

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

}