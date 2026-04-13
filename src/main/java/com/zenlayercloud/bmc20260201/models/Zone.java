package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用区信息， 包含可用区所在的城市等信息。
 */
public class Zone extends TeaModel {


    /**
     * 可用区ID。
     * 例如：SEL-A
     */
    public String zoneId;

    /**
     * 可用区的名称。
     */
    public String zoneName;

    /**
     * 可用区的城市名称。
     */
    public String cityName;

    /**
     * 可用区所在的大区名称。
     */
    public String areaName;

    /**
     * 可用区是否支持SDN三层网络。
     */
    public Boolean isCloudRouterAvailable;

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

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Boolean getIsCloudRouterAvailable() {
        return this.isCloudRouterAvailable;
    }

    public void setIsCloudRouterAvailable(Boolean isCloudRouterAvailable) {
        this.isCloudRouterAvailable = isCloudRouterAvailable;
    }

}