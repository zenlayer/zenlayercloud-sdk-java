/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zbc20240808;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zbc20240808.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;

/**
 * @author wolfgang
 * @date 2022-11-09 19:13:40
 * @version $ Id: BmcClient.java, v 0.1  wolfgang Exp $
 */
public class ZbcClient extends AbstractClient {

    private static final String VERSION  = "2024-08-08";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/zbc";

    public ZbcClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public ZbcClient(Credential credential) {
        this(credential, new Config());
    }

    /**
     * 获取产品或资源组维度月账单汇总金额信息以及账单总帐信息
     */
    public DescribeMonthlyBillSummaryResponse describeMonthlyBillSummary(DescribeMonthlyBillSummaryRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeMonthlyBillSummary", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeMonthlyBillSummaryResponse());
    }


    /**
     * 用于获取月账单明细相关数据信息
     */
    public DescribeBillDetailResponse describeBillDetail(DescribeBillDetailRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeBillDetail", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeBillDetailResponse());
    }

    /**
     * 用于获取用户余额，包括账户余额、信用额度、可用金、冻结金等数据信息
     */
    public DescribeCustomerBalanceResponse describeCustomerBalance(DescribeCustomerBalanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeCustomerBalance", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeCustomerBalanceResponse());
    }


    /**
     * 用于获取用户的充值记录以及订单退款记录等
     */
    public DescribeRechargeRefundHistoryResponse describeRechargeRefundHistory(DescribeRechargeRefundHistoryRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeRechargeRefundHistory", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeRechargeRefundHistoryResponse());
    }


    /**
     * 用于获取用户的充值记录以及订单退款记录等
     */
    public DescribeTransactionHistoryResponse describeTransactionHistory(DescribeTransactionHistoryRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeTransactionHistory", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeTransactionHistoryResponse());
    }

}
