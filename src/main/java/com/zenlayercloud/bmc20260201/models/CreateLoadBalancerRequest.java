package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateLoadBalancerRequest extends TeaModel {


    /**
     * 用于保证请求的幂等性。
     */
    public String clientToken;

    /**
     * 可用区的节点ID。
     */
    public String zoneId;

    /**
     * 负载均衡名称。
     */
    public String loadBalancerName;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月 POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid instanceChargePrepaid;

    /**
     * 带宽值。
     * 取值范围：1-1024。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * 指定负载均衡绑定的IP的类型:
     * 可用值：
     * <ul><li>IPv4</li><li>IPv6</li></ul>
     */
    public String ipType;

    /**
     * 额外购买VIP数量。
     * 负载均衡会默认绑定1个指定类型的IP。
     */
    public Integer vipCount;

    /**
     * 子网ID。
     * 若是创建VIP4类型时，必须指定子网ID。该实例的主备IP将在该子网中获取。
     */
    public String subnetId;

    /**
     * CIDR ID。
     * 创建VIP6类型时需要指定CIDR ID。如果该可用区中存在唯一一个CIDR则可以不指定，默认使用该CIDR。
     */
    public String cidrBlockId;

    /**
     * 主IP。
     */
    public String masterIp;

    /**
     * 备IP。
     */
    public String backupIp;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建负载均衡时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public ChargePrepaid getInstanceChargePrepaid() {
        return this.instanceChargePrepaid;
    }

    public void setInstanceChargePrepaid(ChargePrepaid instanceChargePrepaid) {
        this.instanceChargePrepaid = instanceChargePrepaid;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Integer getVipCount() {
        return this.vipCount;
    }

    public void setVipCount(Integer vipCount) {
        this.vipCount = vipCount;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

    public String getMasterIp() {
        return this.masterIp;
    }

    public void setMasterIp(String masterIp) {
        this.masterIp = masterIp;
    }

    public String getBackupIp() {
        return this.backupIp;
    }

    public void setBackupIp(String backupIp) {
        this.backupIp = backupIp;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}