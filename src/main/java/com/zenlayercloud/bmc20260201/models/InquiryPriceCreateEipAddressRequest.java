package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateEipAddressRequest extends TeaModel {


    /**
     * EIP所属的可用区ID。
     */
    public String zoneId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String eipChargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。
     * 通过该参数可以指定包年包月实例的购买时长等属性。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid eipChargePrepaid;

    /**
     * 指定创建EIP的数量。
     */
    public Integer amount;

    /**
     * 购买的掩码。
     * 可以从DescribeEipAvailableResources接口中获取可用的掩码列表。
     */
    public Integer netmask;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getEipChargeType() {
        return this.eipChargeType;
    }

    public void setEipChargeType(String eipChargeType) {
        this.eipChargeType = eipChargeType;
    }

    public ChargePrepaid getEipChargePrepaid() {
        return this.eipChargePrepaid;
    }

    public void setEipChargePrepaid(ChargePrepaid eipChargePrepaid) {
        this.eipChargePrepaid = eipChargePrepaid;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

}