package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstanceTypesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 查询的机型信息。
     */
    public List<InstanceType> instanceTypes;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    public void setInstanceTypes(List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

}