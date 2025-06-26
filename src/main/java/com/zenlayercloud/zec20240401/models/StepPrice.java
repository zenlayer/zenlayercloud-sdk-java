package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class StepPrice extends TeaModel {


    /**
     * 阶梯的起始值
     */
    public Double stepStart;

    /**
     * 阶梯的到达值。
     * 为null代表最后一级阶梯
     */
    public Double stepEnd;

    /**
     * 阶梯单价
     */
    public Double unitPrice;

    /**
     * 阶梯折后价
     */
    public Double discountUnitPrice;

    public Double getStepStart() {
        return this.stepStart;
    }

    public void setStepStart(Double stepStart) {
        this.stepStart = stepStart;
    }

    public Double getStepEnd() {
        return this.stepEnd;
    }

    public void setStepEnd(Double stepEnd) {
        this.stepEnd = stepEnd;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscountUnitPrice() {
        return this.discountUnitPrice;
    }

    public void setDiscountUnitPrice(Double discountUnitPrice) {
        this.discountUnitPrice = discountUnitPrice;
    }

}