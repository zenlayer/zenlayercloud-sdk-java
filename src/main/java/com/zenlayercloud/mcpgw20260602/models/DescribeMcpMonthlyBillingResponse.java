package com.zenlayercloud.mcpgw20260602.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeMcpMonthlyBillingResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 按Token+日期维度的计费明细。
     */
    public List<BillingItem> items;

    /**
     * 当月用量合计（字符串，保留精度）。
     */
    public String totalUsage;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<BillingItem> getItems() {
        return this.items;
    }

    public void setItems(List<BillingItem> items) {
        this.items = items;
    }

    public String getTotalUsage() {
        return this.totalUsage;
    }

    public void setTotalUsage(String totalUsage) {
        this.totalUsage = totalUsage;
    }

}