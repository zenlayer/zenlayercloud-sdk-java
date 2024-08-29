package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class DescribeMonthlyBillSummaryRequest extends TeaModel {

    /**
     * 账单分组维度 （默认 PRODUCT）
     * PRODUCT:产品维度
     * RESOURCE_GROUP:资源组维度
     */
    public String summaryType;

    /**
     * 账单月份,默认当前月
     */
    public Integer billMonthly;
}
