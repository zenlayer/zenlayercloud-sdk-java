package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class BindPrivateZoneVpcRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 要绑定的VPC列表
     */
    public List<String> vpcIds;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

}