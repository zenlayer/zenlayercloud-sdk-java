package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeZoneGpuInstanceConfigInfosResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * GPU 规格售卖信息列表。
     */
    public List<GpuInstanceTypeQuotaItem> instanceTypeQuotaSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<GpuInstanceTypeQuotaItem> getInstanceTypeQuotaSet() {
        return this.instanceTypeQuotaSet;
    }

    public void setInstanceTypeQuotaSet(List<GpuInstanceTypeQuotaItem> instanceTypeQuotaSet) {
        this.instanceTypeQuotaSet = instanceTypeQuotaSet;
    }

}