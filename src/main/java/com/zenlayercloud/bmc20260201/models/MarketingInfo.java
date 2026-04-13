package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 市场营销活动相关信息
 */
public class MarketingInfo extends TeaModel {


    /**
     * 使用市场发放的折扣码。
     * 如果折扣码不存在，最终折扣将不会生效。
     */
    public String discountCode;

    /**
     * 是否使用POC代金券。
     * 如果系统不存在POC代金券，相关创建流程会失败。
     */
    public Boolean usePocVoucher;

    public String getDiscountCode() {
        return this.discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Boolean getUsePocVoucher() {
        return this.usePocVoucher;
    }

    public void setUsePocVoucher(Boolean usePocVoucher) {
        this.usePocVoucher = usePocVoucher;
    }

}