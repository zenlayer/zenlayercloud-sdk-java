package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class RechargeRefundHistory extends TeaModel {

    /**
     * 交易类型
     */
    public String transactionType;

    /**
     * 入账金额
     */
    public Double amount;

    /**
     * 充值方式
     */
    public String paymentMethod;

    /**
     * 交易id
     */
    public String transactionId;

    /**
     * 状态
     */
    public String state;

    /**
     * 交易时间
     */
    public String transactionTime;

    /**
     * 账户teamId
     */
    public String accountUid;
}
