package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class BillingDetailInfo extends TeaModel {

    /**
     * 资源ID（实例ID）
     */
    public String resourceId;

    /**
     * 产品子项
     */
    public String productSubitem;

    /**
     * 产品
     */
    public String product;

    /**
     * 账单金额
     */
    public Double amount;

    /**
     * 赠金支付金额
     */
    public Double voucher;

    /**
     * 现金支付金额
     */
    public Double cash;

    /**
     * 计费模式
     */
    public String billingMode;

    /**
     * 订单编号
     */
    public String orderSn;

    /**
     * 扣费时间
     */
    public String deductionTime;

    /**
     * label
     */
    public String label;

    /**
     * location
     */
    public String location;

    /**
     * 交易金额
     */
    public Integer billMonthly;

    /**
     * 资源组Uid
     */
    public String resourceGroupId;

    /**
     * 资源组名称
     */
    public String resourceGroupName;

    /**
     * 开始时间
     */
    public String startTime;

    /**
     * 结束时间
     */
    public String endTime;

}
