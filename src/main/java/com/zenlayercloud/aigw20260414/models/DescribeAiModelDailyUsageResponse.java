package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiModelDailyUsageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 日用量数据列表。
     */
    public List<DailyMetricItem> metric;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DailyMetricItem> getMetric() {
        return this.metric;
    }

    public void setMetric(List<DailyMetricItem> metric) {
        this.metric = metric;
    }

}