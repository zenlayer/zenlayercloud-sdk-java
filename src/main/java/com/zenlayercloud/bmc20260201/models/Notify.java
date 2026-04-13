package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Notify 信息
 */
public class Notify extends TeaModel {


    /**
     * 通知开关。
     */
    public Boolean enable;

    /**
     * 地址。
     */
    public String apiAddress;

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getApiAddress() {
        return this.apiAddress;
    }

    public void setApiAddress(String apiAddress) {
        this.apiAddress = apiAddress;
    }

}