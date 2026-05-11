package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 基于DB-IP/ipdata/... 第三方IP数据库服务商查询到的 IP 地理信息结果。
 */
public class EipGeoInfo extends TeaModel {


    /**
     * 从MaxMind查询的地理信息。
     */
    public String maxMind;

    /**
     * 从IPinfo(ipinfo.io)查询的地理信息。
     */
    public String ipInfo;

    /**
     * 从DB-IP(db-ip.com)查询的地理信息。
     */
    public String dbIp;

    /**
     * 从ipData(ipdata.co)查询的地理信息。
     */
    public String ipData;

    /**
     * 从IpGeoLocation查询的地理信息。
     */
    public String ipGeoLocation;

    /**
     * 需要查询EIP的所在的地理信息。
     */
    public String standard;

    /**
     * 查询地理信息是否和所在的地理信息一致。
     */
    public Boolean isConsistent;

    public String getMaxMind() {
        return this.maxMind;
    }

    public void setMaxMind(String maxMind) {
        this.maxMind = maxMind;
    }

    public String getIpInfo() {
        return this.ipInfo;
    }

    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }

    public String getDbIp() {
        return this.dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public String getIpData() {
        return this.ipData;
    }

    public void setIpData(String ipData) {
        this.ipData = ipData;
    }

    public String getIpGeoLocation() {
        return this.ipGeoLocation;
    }

    public void setIpGeoLocation(String ipGeoLocation) {
        this.ipGeoLocation = ipGeoLocation;
    }

    public String getStandard() {
        return this.standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Boolean getIsConsistent() {
        return this.isConsistent;
    }

    public void setIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
    }

}