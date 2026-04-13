package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 预付费模式，即包年包月相关参数设置。
 */
public class ChargePrepaid extends TeaModel {


    /**
     * 购买实例的时长。
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