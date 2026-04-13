package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstanceAvailableCidrBlockResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例可用的Cidr Block列表。
     */
    public List<InstanceAvailableCidrBlock> instanceAvailableCidrBlocks;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceAvailableCidrBlock> getInstanceAvailableCidrBlocks() {
        return this.instanceAvailableCidrBlocks;
    }

    public void setInstanceAvailableCidrBlocks(List<InstanceAvailableCidrBlock> instanceAvailableCidrBlocks) {
        this.instanceAvailableCidrBlocks = instanceAvailableCidrBlocks;
    }

}