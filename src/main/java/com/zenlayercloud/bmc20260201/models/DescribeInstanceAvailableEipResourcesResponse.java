package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstanceAvailableEipResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例可用EIP列表。
     */
    public List<InstanceAvailableEip> instanceEipResources;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceAvailableEip> getInstanceEipResources() {
        return this.instanceEipResources;
    }

    public void setInstanceEipResources(List<InstanceAvailableEip> instanceEipResources) {
        this.instanceEipResources = instanceEipResources;
    }

}