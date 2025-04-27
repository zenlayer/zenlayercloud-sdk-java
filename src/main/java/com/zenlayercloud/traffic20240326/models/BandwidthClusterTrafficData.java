package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 共享带宽包带宽数据点。
 */
public class BandwidthClusterTrafficData extends TeaModel {


    /**
     * 入口带宽。
     * 单位：bps
     */
    public Long internetRX;

    /**
     * 出口带宽。
     * 单位：bps
     */
    public Long internetTX;

    /**
     * 数据时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
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