package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeSubnetAvailableResourcesRequest extends TeaModel {


    /**
     * 可用区ID。
     * 不传则查询所有可创建Subnet的可用区。
     */
    public String zoneId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}