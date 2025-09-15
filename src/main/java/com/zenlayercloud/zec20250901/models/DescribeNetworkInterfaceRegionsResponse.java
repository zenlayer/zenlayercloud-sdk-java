package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 支持网卡的区域信息。
 */
public class DescribeNetworkInterfaceRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 支持网卡的节点ID
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