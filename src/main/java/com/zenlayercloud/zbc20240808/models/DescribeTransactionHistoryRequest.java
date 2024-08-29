package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeTransactionHistoryRequest extends TeaModel {
    /**
     * 页码，默认1
     */
    public Integer pageNum;

    /**
     * 每页大小
     */
    public Integer pageSize;

    /**
     * 交易类型
     * PAYING: 支付中
     * PAY_FAILED: 支付失败
     * PAY_SUCCESS: 支付成功
     */
    public List<String> transactionType;

    /**
     * 开始时间
     */
    public String startTime;

    /**
     * 结束时间
     */
    public String endTime;

}
