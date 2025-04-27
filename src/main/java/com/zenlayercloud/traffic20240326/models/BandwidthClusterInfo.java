package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 共享带宽包的基本信息。
 */
public class BandwidthClusterInfo extends TeaModel {


    /**
     * 共享带宽包唯一ID
     */
    public String bandwidthClusterId;

    /**
     * 共享带宽包显示名称
     */
    public String bandwidthClusterName;

    /**
     * IP 网络类型
     */
    public String networkType;

    /**
     * 区域代号
     */
    public String areaCode;

    /**
     * 带宽计费方式
     */
    public String internetChargeType;

    /**
     * 保底带宽。
     * 单位：Mbps
     */
    public Integer commitBandwidthMbps;

    /**
     * 所属区域
     */
    public String location;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String createTime;

    /**
     * 带宽包内的资源数量
     */
    public Integer resourceNumber;

    /**
     * 城市信息
     */
    public List<CityInfo> cities;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

    public String getBandwidthClusterName() {
        return this.bandwidthClusterName;
    }

    public void setBandwidthClusterName(String bandwidthClusterName) {
        this.bandwidthClusterName = bandwidthClusterName;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getCommitBandwidthMbps() {
        return this.commitBandwidthMbps;
    }

    public void setCommitBandwidthMbps(Integer commitBandwidthMbps) {
        this.commitBandwidthMbps = commitBandwidthMbps;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getResourceNumber() {
        return this.resourceNumber;
    }

    public void setResourceNumber(Integer resourceNumber) {
        this.resourceNumber = resourceNumber;
    }

    public List<CityInfo> getCities() {
        return this.cities;
    }

    public void setCities(List<CityInfo> cities) {
        this.cities = cities;
    }

}