package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyNatGatewayRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * NAT网关的subnet ID 不传为all
     */
    public List<String> subnetIds;

    /**
     * 是否开启ICMP代回。
     * 默认值：true
     */
    public Boolean icmpReplyEnabled;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }


    public Boolean getIcmpReplyEnabled() {
        return icmpReplyEnabled;
    }

    public void setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
    }
}