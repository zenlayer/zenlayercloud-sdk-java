package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述价格的信息。
 */
public class PriceItem extends TeaModel {


    /**
     * 折扣大小。
     * 如80.0代表8折
     */
    public Double discount;

    /**
     * 后付费的单元折后价格。
     * 后付费模式使用，如果价格为阶梯价格，该项为null
     */
    public Double discountPrice;

    /**
     * 预付费的原价。
     * 预付费模式使用，后付费该值为 null
     */
    public Double originalPrice;

    /**
     * 后付费的单元原始价格。
     * 后付费模式使用，如果价格为阶梯价格，该项为null
     */
    public Double unitPrice;

    /**
     * 后付费的单元折后价格。
     * 后付费模式使用，如果价格为阶梯价格，该项为null
     */
    public Double discountUnitPrice;

    /**
     * 后付费计价单元。
     * 后付费模式使用，可取值范围：<br/>HOUR: 表示计价单元是按每小时来计算。
     * DAY: 表示计价单元是按天来计算。
     * MONTH: 表示计价单元是按月来计算，95计费则是这种
     */
    public String chargeUnit;

    /**
     * 后付费阶梯价格。
     * 后付费模式使用，如果非阶梯价格，该项为null
     */
    public List<StepPrice> stepPrices;

    /**
     * 用量单位。
     * 比如Mbps, LCU等。
     * 如果为null, 代表取不到值
     */
    public String amountUnit;

    /**
     * 超量原始价格
     */
    public Double excessUnitPrice;

    /**
     * 超量折扣后价格
     */
    public Double excessDiscountUnitPrice;

    /**
     * 超量用量单位。
     * 如果为null, 代表取不到值
     */
    public String excessAmountUnit;

    /**
     * 价格所属类别
     */
    public String category;

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getChargeUnit() {
        return this.chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public List<StepPrice> getStepPrices() {
        return this.stepPrices;
    }

    public void setStepPrices(List<StepPrice> stepPrices) {
        this.stepPrices = stepPrices;
    }

    public String getAmountUnit() {
        return this.amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }

    public Double getExcessUnitPrice() {
        return this.excessUnitPrice;
    }

    public void setExcessUnitPrice(Double excessUnitPrice) {
        this.excessUnitPrice = excessUnitPrice;
    }

    public Double getExcessDiscountUnitPrice() {
        return this.excessDiscountUnitPrice;
    }

    public void setExcessDiscountUnitPrice(Double excessDiscountUnitPrice) {
        this.excessDiscountUnitPrice = excessDiscountUnitPrice;
    }

    public String getExcessAmountUnit() {
        return this.excessAmountUnit;
    }

    public void setExcessAmountUnit(String excessAmountUnit) {
        this.excessAmountUnit = excessAmountUnit;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}