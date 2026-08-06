package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeZoneAcceleratorConfigInfosResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 加速卡规格售卖信息列表。
     */
    public List<AcceleratorTypeQuotaItem> instanceTypeQuotaSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AcceleratorTypeQuotaItem> getInstanceTypeQuotaSet() {
        return this.instanceTypeQuotaSet;
    }

    public void setInstanceTypeQuotaSet(List<AcceleratorTypeQuotaItem> instanceTypeQuotaSet) {
        this.instanceTypeQuotaSet = instanceTypeQuotaSet;
    }

}