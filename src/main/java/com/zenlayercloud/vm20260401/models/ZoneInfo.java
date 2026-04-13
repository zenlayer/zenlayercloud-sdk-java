package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用区的基本信息。
 */
public class ZoneInfo extends TeaModel {


    /**
     * 区域ID。
     */
    public String zoneId;

    /**
     * 区域名称。
     */
    public String zoneName;

    /**
     * 是否支持安全组。
     */
    public Boolean supportSecurityGroup;

    /**
     * 支持的网络类型。
     * CLASSICS：经典网络。
     * VPC：VPC网络。
     */
    public String supportNetworkType;

    /**
     * 是否支持公网IPv6。
     */
    public Boolean supportIpv6;

    /**
     * 是否支持CPU透传。
     */
    public Boolean supportCpuPassThrough;

    /**
     * 网络线路信息。
     */
    public String networkLineType;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Boolean getSupportSecurityGroup() {
        return this.supportSecurityGroup;
    }

    public void setSupportSecurityGroup(Boolean supportSecurityGroup) {
        this.supportSecurityGroup = supportSecurityGroup;
    }

    public String getSupportNetworkType() {
        return this.supportNetworkType;
    }

    public void setSupportNetworkType(String supportNetworkType) {
        this.supportNetworkType = supportNetworkType;
    }

    public Boolean getSupportIpv6() {
        return this.supportIpv6;
    }

    public void setSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
    }

    public Boolean getSupportCpuPassThrough() {
        return this.supportCpuPassThrough;
    }

    public void setSupportCpuPassThrough(Boolean supportCpuPassThrough) {
        this.supportCpuPassThrough = supportCpuPassThrough;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

}