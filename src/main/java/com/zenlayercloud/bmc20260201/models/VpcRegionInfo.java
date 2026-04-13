package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * VPC 节点的信息。
 */
public class VpcRegionInfo extends TeaModel {


    /**
     * VPC的节点ID。
     */
    public String vpcRegionId;

    /**
     * VPC的节点名称。
     */
    public String vpcRegionName;

    /**
     * Zone ID 列表。
     */
    public List<String> zoneIds;

    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public void setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
    }

    public String getVpcRegionName() {
        return this.vpcRegionName;
    }

    public void setVpcRegionName(String vpcRegionName) {
        this.vpcRegionName = vpcRegionName;
    }

    public List<String> getZoneIds() {
        return this.zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

}