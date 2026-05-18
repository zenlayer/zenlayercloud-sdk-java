package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeAiModelDailyCacheHitRateRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceIds;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 月份，格式："2026-2" 或 "2026-02"。
     */
    public String month;

    public String getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}