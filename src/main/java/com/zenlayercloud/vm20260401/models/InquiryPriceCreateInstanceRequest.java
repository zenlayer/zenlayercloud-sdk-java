package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceCreateInstanceRequest extends TeaModel {


    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 指定有效的镜像ID。
     */
    public String imageId;

    /**
     * 实例机型。
     */
    public String instanceType;

    /**
     * 实例计费类型。
     * PREPAID：预付费。
     * POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid instanceChargePrepaid;

    /**
     * 后付费模式相关参数设置。
     */
    public ChargePostpaid instanceChargePostpaid;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 流量包订购大小，单位TB。
     */
    public Double trafficPackageSize;

    /**
     * 公网出带宽上限，单位Mbps。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 指定创建实例的数量。
     */
    public Integer instanceCount;

    /**
     * 系统盘配置。
     */
    public SystemDisk systemDisk;

    /**
     * 数据盘配置。
     */
    public List<DataDisk> dataDisks;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
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

    public ChargePostpaid getInstanceChargePostpaid() {
        return this.instanceChargePostpaid;
    }

    public void setInstanceChargePostpaid(ChargePostpaid instanceChargePostpaid) {
        this.instanceChargePostpaid = instanceChargePostpaid;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
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

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public void setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
    }

    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public void setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
    }

}