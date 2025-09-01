package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

public class EipGeoRef extends TeaModel {
    public String ip;

    public String dbIp;

    public String ipData;

    public String ipInfo;

    public String maxMind;

    public String standard;

    public Boolean isConsistent;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public String getIpData() {
        return ipData;
    }

    public void setIpData(String ipData) {
        this.ipData = ipData;
    }

    public String getIpInfo() {
        return ipInfo;
    }

    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }

    public String getMaxMind() {
        return maxMind;
    }

    public void setMaxMind(String maxMind) {
        this.maxMind = maxMind;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Boolean getConsistent() {
        return isConsistent;
    }

    public void setConsistent(Boolean consistent) {
        isConsistent = consistent;
    }
}
