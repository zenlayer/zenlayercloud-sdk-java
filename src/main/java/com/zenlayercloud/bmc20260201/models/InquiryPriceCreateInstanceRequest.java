package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateInstanceRequest extends TeaModel {


    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 实例机型ID。
     * 具体取值可通过调用接口DescribeInstanceTypes来获得最新的规格表。
     */
    public String instanceTypeId;

    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。 POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 通过该参数可以指定包年包月实例的购买时长等属性。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid instanceChargePrepaid;

    /**
     * 流量包订购大小。
     * 单位为TB。该值仅限当 internetChargeType = ByTrafficPackage 生效。
     */
    public Double trafficPackageSize;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。
     * 默认值：1Mbps。
     * 不同机型带宽上限范围不一致，具体限制详见购买网络带宽。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public ChargePrepaid getInstanceChargePrepaid() {
        return this.instanceChargePrepaid;
    }

    public void setInstanceChargePrepaid(ChargePrepaid instanceChargePrepaid) {
        this.instanceChargePrepaid = instanceChargePrepaid;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

}