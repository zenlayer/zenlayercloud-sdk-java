package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 边界网关互联节点关联的数据中心信息。
 */
public class InterconnectDataCenter extends TeaModel {


    /**
     * 数据中心UUID。
     */
    public String dcId;

    /**
     * 数据中心代码。
     */
    public String dcCode;

    /**
     * 数据中心英文名称。
     */
    public String name;

    /**
     * 城市英文名称。
     */
    public String cityName;

    /**
     * 国家英文名称。
     */
    public String countryName;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getDcCode() {
        return this.dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

}