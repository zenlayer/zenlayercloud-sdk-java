package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述城市的基本信息。
 */
public class CityInfo extends TeaModel {


    /**
     * 城市名称
     */
    public String cityName;

    /**
     * 城市三字码代号
     */
    public String cityCode;

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