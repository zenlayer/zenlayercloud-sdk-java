package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询EIP支持的网络计费模式的响应值。
 */
public class DescribeEipInternetChargeTypesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * IP支持的网络计费方式
     */
    public List<String> internetChargeTypes;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getInternetChargeTypes() {
        return this.internetChargeTypes;
    }

    public void setInternetChargeTypes(List<String> internetChargeTypes) {
        this.internetChargeTypes = internetChargeTypes;
    }

}