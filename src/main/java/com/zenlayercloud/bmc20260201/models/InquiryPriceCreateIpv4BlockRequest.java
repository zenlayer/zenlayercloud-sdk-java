package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateIpv4BlockRequest extends TeaModel {


    /**
     * cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * CIDR地址块的类型。
     */
    public String cidrType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长等属性。若指定Cidr Block的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid chargePrepaid;

    /**
     * 购买的掩码。
     * 可以从DescribeAvailableIpv4Resource接口中获取可用的掩码列表。
     */
    public Integer netmask;

    /**
     * 购买的数量。
     */
    public Integer amount;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCidrType() {
        return this.cidrType;
    }

    public void setCidrType(String cidrType) {
        this.cidrType = cidrType;
    }

    public ChargePrepaid getChargePrepaid() {
        return this.chargePrepaid;
    }

    public void setChargePrepaid(ChargePrepaid chargePrepaid) {
        this.chargePrepaid = chargePrepaid;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}