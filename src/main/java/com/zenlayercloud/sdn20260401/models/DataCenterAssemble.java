package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述数据中心的基本信息，包括位置、坐标及数据中心端口可用带宽等。
 */
public class DataCenterAssemble extends TeaModel {


    /**
     * 数据中心 ID。
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
     * 所在城市名称。
     */
    public String cityName;

    /**
     * 所在国家名称。
     */
    public String countryName;

    /**
     * 所在大区名称。
     */
    public String areaName;

    /**
     * 纬度。
     */
    public Double latitude;

    /**
     * 经度。
     */
    public Double longitude;

    /**
     * 是否支持新建数据中心端口。
     */
    public Boolean isPortAvailable;

    /**
     * 可用带宽（Mbps）。
     */
    public Integer availableBandwidth;

    /**
     * 节点 ID。
     */
    public String regionId;

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

    public Boolean getIsPortAvailable() {
        return this.isPortAvailable;
    }

    public void setIsPortAvailable(Boolean isPortAvailable) {
        this.isPortAvailable = isPortAvailable;
    }

    public Integer getAvailableBandwidth() {
        return this.availableBandwidth;
    }

    public void setAvailableBandwidth(Integer availableBandwidth) {
        this.availableBandwidth = availableBandwidth;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}