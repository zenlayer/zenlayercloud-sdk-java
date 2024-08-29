package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class TransactionHistory extends TeaModel {

    /**
     * 账户teamId
     */
    public String accountUid;

    /**
     * 交易uid
     */
    public String uid;

    /**
     * 交易时间
     */
    public String transactionTime;

    /**
     * 订单编号
     */
    public String orderSn;

    /**
     * 描述
     */
    public String description;

    /**
     * 交易类型
     */
    public String transactionType;

    /**
     * 付款方式
     */
    public String paymentMethod;

    /**
     * 交易金额
     */
    public Double amount;

    /**
     * 余额
     */
    public Double cashBalance;

    /**
     * 收(INCOME)/支(EXPENDITURE)
     */
    public String tradeType;

    /**
     * 交易编号
     */
    public String tradeNo;
}
