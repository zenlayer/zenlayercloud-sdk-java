package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeZoneInstanceConfigInfosResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区机型配置列表。
     */
    public List<InstanceTypeQuotaItem> instanceTypeQuotaSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceTypeQuotaItem> getInstanceTypeQuotaSet() {
        return this.instanceTypeQuotaSet;
    }

    public void setInstanceTypeQuotaSet(List<InstanceTypeQuotaItem> instanceTypeQuotaSet) {
        this.instanceTypeQuotaSet = instanceTypeQuotaSet;
    }

}