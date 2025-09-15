package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建边界网关的请求参数。
 */
public class CreateBorderGatewayRequest extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * VPC ID
     */
    public String vpcId;

    /**
     * 名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String label;

    /**
     * ASN号
     */
    public Integer asn;

    /**
     * 路由级别
     */
    public String routingMode;

    /**
     * 子网宣告控制
     */
    public String advertisedSubnet;

    /**
     * IPv4 Cidr集合
     */
    public List<String> advertisedCidrs;

    /**
     * 自定义路由ID集合
     */
    public List<String> advertisedRouteIds;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getAsn() {
        return this.asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
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

    public List<String> getAdvertisedRouteIds() {
        return this.advertisedRouteIds;
    }

    public void setAdvertisedRouteIds(List<String> advertisedRouteIds) {
        this.advertisedRouteIds = advertisedRouteIds;
    }

}