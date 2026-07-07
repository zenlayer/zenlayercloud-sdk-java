package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeEipNetworkLineTypesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 各节点支持的IP线路类型列表。
     */
    public List<EipRegionNetworkLineType> regionNetworkLineTypes;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<EipRegionNetworkLineType> getRegionNetworkLineTypes() {
        return this.regionNetworkLineTypes;
    }

    public void setRegionNetworkLineTypes(List<EipRegionNetworkLineType> regionNetworkLineTypes) {
        this.regionNetworkLineTypes = regionNetworkLineTypes;
    }

}