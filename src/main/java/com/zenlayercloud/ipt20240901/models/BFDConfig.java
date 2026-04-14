package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * BFD配置。
 */
public class BFDConfig extends TeaModel {


    /**
     * 发送间隔。
     * 单位：ms。
     * 取值范围：100～60000。
     */
    public Integer bfdTxInterval;

    /**
     * 接收间隔。
     * 单位：ms
     * 取值范围：100～60000。
     */
    public Integer bfdRxInterval;

    /**
     * 本地检测倍数。
     * 取值范围：3～20。
     */
    public Integer bfdMultiplier;

    public Integer getBfdTxInterval() {
        return this.bfdTxInterval;
    }

    public void setBfdTxInterval(Integer bfdTxInterval) {
        this.bfdTxInterval = bfdTxInterval;
    }

    public Integer getBfdRxInterval() {
        return this.bfdRxInterval;
    }

    public void setBfdRxInterval(Integer bfdRxInterval) {
        this.bfdRxInterval = bfdRxInterval;
    }

    public Integer getBfdMultiplier() {
        return this.bfdMultiplier;
    }

    public void setBfdMultiplier(Integer bfdMultiplier) {
        this.bfdMultiplier = bfdMultiplier;
    }

}