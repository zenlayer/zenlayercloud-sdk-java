package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyBorderGatewaysAttributeRequest extends TeaModel {


    /**
     * 边界网关的ID列表
     */
    public List<String> zbgIds;

    /**
     * 边界网关的名称
     */
    public String name;

    /**
     * 路由级别
     */
    public String routingMode;

    /**
     * 子网控制
     */
    public String advertisedSubnet;

    /**
     * IPv4 Cidr集合
     */
    public List<String> advertisedCidrs;

    /**
     * 边界网关的ASN
     */
    public Integer asn;

    public List<String> getZbgIds() {
        return this.zbgIds;
    }

    public void setZbgIds(List<String> zbgIds) {
        this.zbgIds = zbgIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoutingMode() {
        return this.routingMode;
    }

    public void setRoutingMode(String routingMode) {
        this.routingMode = routingMode;
    }

    public String getAdvertisedSubnet() {
        return this.advertisedSubnet;
    }

    public void setAdvertisedSubnet(String advertisedSubnet) {
        this.advertisedSubnet = advertisedSubnet;
    }

    public List<String> getAdvertisedCidrs() {
        return this.advertisedCidrs;
    }

    public void setAdvertisedCidrs(List<String> advertisedCidrs) {
        this.advertisedCidrs = advertisedCidrs;
    }

    public Integer getAsn() {
        return this.asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

}