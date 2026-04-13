package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipAvailableResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 购买EIP区域列表。
     */
    public List<EipAvailable> eipResources;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<EipAvailable> getEipResources() {
        return this.eipResources;
    }

    public void setEipResources(List<EipAvailable> eipResources) {
        this.eipResources = eipResources;
    }

}