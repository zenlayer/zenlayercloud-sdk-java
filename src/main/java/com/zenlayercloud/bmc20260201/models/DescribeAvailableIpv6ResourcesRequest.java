package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeAvailableIpv6ResourcesRequest extends TeaModel {


    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}