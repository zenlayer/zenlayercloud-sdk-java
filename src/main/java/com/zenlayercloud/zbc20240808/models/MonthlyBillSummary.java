package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class MonthlyBillSummary extends TeaModel {

    /**
     * 产品
     */
    public String product;

    /**
     * 资源组名称
     */
    public String resourceGroupName;

    /**
     * 资源组Uid
     */
    public String resourceGroupId;

    /**
     * 支出金额
     */
    public Double spend;

    /**
     * 代金券支付金额
     */
    public Double voucher;

    /**
     * 现金支付金额
     */
    public Double cash;

    /**
     * 退款金额
     */
    public Double refund;
}
