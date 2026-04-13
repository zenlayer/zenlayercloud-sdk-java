package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 后付费阶梯价格。描述了价格的一个阶梯的信息。
 */
public class StepPrice extends TeaModel {


    /**
     * 阶梯用量的开始。
     */
    public Double stepStart;

    /**
     * 阶梯用量的结束。
     */
    public Double stepEnd;

    /**
     * 当前阶梯的单元原始价格。
     * 后付费模式使用。
     */
    public Double unitPrice;

    /**
     * 当前阶梯的单元折后价格。
     * 后付费模式使用。
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