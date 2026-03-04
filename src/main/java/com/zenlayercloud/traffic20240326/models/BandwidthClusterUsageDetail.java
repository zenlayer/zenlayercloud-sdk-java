package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 带宽用量详情数据。
 */
public class BandwidthClusterUsageDetail extends TeaModel {


    /**
     * 城市名称。
     */
    public String cityName;

    /**
     * 城市代码。
     */
    public String cityCode;

    /**
     * 产品来源。
     */
    public String product;

    /**
     * 带宽值。
     * 单位：Mbps。
     */
    public Double value;

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

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}