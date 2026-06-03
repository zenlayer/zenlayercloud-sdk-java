package com.zenlayercloud.mcpgw20260602.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeMcpMonthlyBillingRequest extends TeaModel {


    /**
     * 月份，格式："2026-05"。
     */
    public String month;

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}