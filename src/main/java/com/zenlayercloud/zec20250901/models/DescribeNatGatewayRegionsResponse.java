package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNatGatewayRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 节点ID集合
     */
    public List<String> regionIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getRegionIds() {
        return this.regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

}