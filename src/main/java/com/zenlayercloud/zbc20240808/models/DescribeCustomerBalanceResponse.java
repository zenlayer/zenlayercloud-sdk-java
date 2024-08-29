package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class DescribeCustomerBalanceResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 账户teamId
     */
    public String accountUid;

    /**
     * 账户余额
     */
    public Double cashBalance;

    /**
     * 信用额度
     */
    public Double creditValue;

    /**
     * 可用金
     */
    public Double purchasingPower;

    /**
     * 冻结金
     */
    public Double orderFrozenAmount;
}
