package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 后付费模式，即按量付费相关参数设置。
 */
public class ChargePostpaid extends TeaModel {


    /**
     * 后付费时长。
     * 单位：月。
     */
    public Integer period;

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

}