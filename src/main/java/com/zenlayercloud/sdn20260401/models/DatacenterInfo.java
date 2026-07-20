package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 数据中心的基本信息。
 */
public class DatacenterInfo extends TeaModel {


    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 数据中心名称。
     */
    public String dcName;

    /**
     * 数据中心地址。
     */
    public String dcAddress;

    /**
     * 数据中心所在城市名称。
     */
    public String cityName;

    /**
     * 数据中心所在国家名称。
     */
    public String countryName;

    /**
     * 数据中心所在区域名称。
     */
    public String areaName;

    /**
     * 数据中心所在地纬度。
     */
    public Double latitude;

    /**
     * 数据中心所在地经度。
     */
    public Double longitude;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getDcName() {
        return this.dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public String getDcAddress() {
        return this.dcAddress;
    }

    public void setDcAddress(String dcAddress) {
        this.dcAddress = dcAddress;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}