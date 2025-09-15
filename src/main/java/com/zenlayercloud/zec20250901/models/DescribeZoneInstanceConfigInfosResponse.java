package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询可用区售卖的机型信息的响应结果
 */
public class DescribeZoneInstanceConfigInfosResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例规格信息
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