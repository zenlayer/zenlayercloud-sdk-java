package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeIpv6CidrPriceRequest extends TeaModel {


    /**
     * 查询IPv6 CIDR所在的节点ID。
     */
    public String regionId;

    /**
     * 查询IPv6 CIDR的IP线路类型。
     */
    public String networkLineType;

    /**
     * 需要查询的CIDR掩码与数量。
     */
    public Ipv6NetmaskInfo netmask;

    /**
     * 后付费的承诺期设置。
     * 仅支持账号已开通的承诺期时长，需与下单时传入的值一致。
     */
    public ChargePostpaid instanceChargePostpaid;

    /**
     * 市场营销相关的选项。
     */
    public MarketingInfo marketingOptions;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    public Ipv6NetmaskInfo getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Ipv6NetmaskInfo netmask) {
        this.netmask = netmask;
    }

    public ChargePostpaid getInstanceChargePostpaid() {
        return this.instanceChargePostpaid;
    }

    public void setInstanceChargePostpaid(ChargePostpaid instanceChargePostpaid) {
        this.instanceChargePostpaid = instanceChargePostpaid;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

}