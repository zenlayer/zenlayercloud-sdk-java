package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeAvailableResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用资源的集合。
     */
    public List<AvailableResource> availableResources;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AvailableResource> getAvailableResources() {
        return this.availableResources;
    }

    public void setAvailableResources(List<AvailableResource> availableResources) {
        this.availableResources = availableResources;
    }

}