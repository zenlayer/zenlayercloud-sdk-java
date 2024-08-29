package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeTransactionHistoryResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 总收入
     */
    public Double incomeSum;

    /**
     * 总支出
     */
    public Double expenditureSum;

    /**
     * 数据总数。
     */
    public Integer totalCount;

    /**
     * 结果集。
     */
    public List<TransactionHistory> dataSet;

}
