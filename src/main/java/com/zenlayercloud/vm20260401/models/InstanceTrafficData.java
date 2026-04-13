package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 实例的带宽数据。
 */
public class InstanceTrafficData extends TeaModel {


    /**
     * 入口流量，单位bps。
     */
    public Long internetRX;

    /**
     * 出口流量，单位bps。
     */
    public Long internetTX;

    /**
     * 时间。
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