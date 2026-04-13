package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeVpcAvailableRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * VpcRegionInfo结果集。
     */
    public List<VpcRegionInfo> vpcRegionSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<VpcRegionInfo> getVpcRegionSet() {
        return this.vpcRegionSet;
    }

    public void setVpcRegionSet(List<VpcRegionInfo> vpcRegionSet) {
        this.vpcRegionSet = vpcRegionSet;
    }

}