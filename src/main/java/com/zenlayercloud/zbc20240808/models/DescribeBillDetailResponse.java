package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBillDetailResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 总支出
     */
    public Double totalSpend;

    /**
     * 代金券总支付金额
     */
    public Double totalVoucher;

    /**
     * 现金总支付金额
     */
    public Double totalCash;

    /**
     * 退款总金额
     */
    public Double totalRefund;

    /**
     * 数据总数。
     */
    public Integer totalCount;

    /**
     * 结果集。
     */
    public List<BillingDetailInfo> dataSet;
}
