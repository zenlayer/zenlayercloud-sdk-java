package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateInstanceRequest extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 实例机型。
     * 具体取值可通过调用接口[DescribeZoneInstanceConfigInfos](describezoneinstanceconfiginfos.md)来获得最新的规格表
     */
    public String instanceType;

    /**
     * 公网IPv4的线路类型。
     * 目前不支持三线IP(`ThreeLine`)
     */
    public String eipV4Type;

    /**
     * 公网IP的网络计费类型
     */
    public String internetChargeType;

    /**
     * 流量包订购大小。
     * 单位为TB。
     * 该值必须在`internetChargeType = ByTrafficPackage`时才会生效
     */
    public Double trafficPackageSize;

    /**
     * 公网出带宽上限。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * 实例数量
     */
    public Integer instanceCount;

    /**
     * 系统盘相关信息
     */
    public SystemDisk systemDisk;

    /**
     * 数据盘相关信息
     */
    public DataDisk dataDisk;

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

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
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

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
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

    public DataDisk getDataDisk() {
        return this.dataDisk;
    }

    public void setDataDisk(DataDisk dataDisk) {
        this.dataDisk = dataDisk;
    }

}