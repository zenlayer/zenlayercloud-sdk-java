package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNatGatewayDetailResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * NAT网关唯一ID
     */
    public String natGatewayId;

    /**
     * NAT网关名称
     */
    public String name;

    /**
     * SNAT网关规则集合
     */
    public List<SnatEntry> snats;

    /**
     * DNAT网关规则集合
     */
    public List<DnatEntry> dnats;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SnatEntry> getSnats() {
        return this.snats;
    }

    public void setSnats(List<SnatEntry> snats) {
        this.snats = snats;
    }

    public List<DnatEntry> getDnats() {
        return this.dnats;
    }

    public void setDnats(List<DnatEntry> dnats) {
        this.dnats = dnats;
    }

}