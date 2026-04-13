package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeVpcAvailableRegionsRequest extends TeaModel {


    /**
     * 所属的可用区ID。
     */
    public String zoneId;

    /**
     * VPC的节点ID。
     */
    public String vpcRegionId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public void setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
    }

}