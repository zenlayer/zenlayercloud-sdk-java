package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述节点的基本信息。包括节点ID、名称等。
 */
public class Region extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 节点所属的城市名称
     */
    public String cityName;

    /**
     * 城市对应的三字码
     */
    public String cityCode;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

}