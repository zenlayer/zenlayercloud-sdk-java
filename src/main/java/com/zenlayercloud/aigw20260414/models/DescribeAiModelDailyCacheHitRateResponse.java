package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiModelDailyCacheHitRateResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 日期列表。
     */
    public List<String> dates;

    /**
     * 日模型缓存命中率。
     */
    public List<ModelCacheHitSeries> cacheHit;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getDates() {
        return this.dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<ModelCacheHitSeries> getCacheHit() {
        return this.cacheHit;
    }

    public void setCacheHit(List<ModelCacheHitSeries> cacheHit) {
        this.cacheHit = cacheHit;
    }

}