package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述IP带宽的数据点信息。包括出/入方向的带宽。
 */
public class EipTrafficData extends TeaModel {


    /**
     * 入方向带宽值。
     * 单位：bps
     */
    public Long internetRX;

    /**
     * 出方向带宽值。
     * 单位：bps
     */
    public Long internetTX;

    /**
     * 数据时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ
     */
    public String time;

    public Long getInternetRX() {
        return this.internetRX;
    }

    public void setInternetRX(Long internetRX) {
        this.internetRX = internetRX;
    }

    public Long getInternetTX() {
        return this.internetTX;
    }

    public void setInternetTX(Long internetTX) {
        this.internetTX = internetTX;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}