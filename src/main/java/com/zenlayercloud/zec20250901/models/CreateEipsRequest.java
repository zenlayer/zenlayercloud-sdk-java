package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateEipsRequest extends TeaModel {


    /**
     * 创建EIP所在的节点ID。
     */
    public String regionId;

    /**
     * EIP的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String name;

    /**
     * 公网弹性IP的网络计费方式。
     */
    public String internetChargeType;

    /**
     * 需要创建EIP的数量。
     */
    public Integer amount;

    /**
     * 掩码长度，取值范围24–32，默认32。
     * 指定小于32时，将创建EIP Block资源，此时必须同时指定`cidrId`，且取值不能小于所选CIDR自身的掩码长度。
     */
    public Integer prefixLength;

    /**
     * 公网弹性IP的线路类型。
     * 已废弃，请使用`networkLineType`。
     */
    @Deprecated
    public String eipV4Type;

    /**
     * 公网弹性IP的线路类型。
     */
    public String networkLineType;

    /**
     * 主公网IP的运营商。
     */
    @Deprecated
    public String primaryIsp;

    /**
     * 公网弹性IP的带宽限速。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    /**
     * 指定CIDR ID，使用CIDR内分配弹性IP。
     * 该字段和`eipV4Type`不能同时指定。
     */
    public String cidrId;

    /**
     * 指定公网起始地址开始创建弹性IP。
     * 不指定`cidrId`时，从公网IP池按此地址开始顺序分配（仅支持`prefixLength`为32）；指定`cidrId`时，从该CIDR内按此地址开始分配。
     * `prefixLength`为32时填纯IPv4地址；`prefixLength`小于32时必须同时指定`cidrId`，填带掩码的起始网段（掩码须与`prefixLength`一致，如`88.0.5.64/26`）。
     */
    public String publicIp;

    /**
     * 弹性公网IP所放的资源组ID，如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 弹性公网IP的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 当网络计费方式为流量计费(`ByTrafficPackage`)时需要指定。
     */
    public Double flowPackage;

    /**
     * 共享带宽包ID。
     * 当网络计费方式为共享带宽包计费(`BandwidthCluster`)时需要指定。
     */
    public String clusterId;

    /**
     * 远端的节点ID。
     */
    public String peerRegionId;

    /**
     * 市场营销的相关选项。
     */
    public MarketingInfo marketingOptions;

    /**
     * 弹性公网IP绑定的标签。
     * 注意：实例关联`标签键`不能重复。
     */
    public TagAssociation tags;

    /**
     * 要绑定的实例ID集合。
     * 数量需要与`amount`字段一致。
     */
    public List<String> instanceIds;

    /**
     * 绑定类型。
     * 当指定`instanceIds`时生效。
     * 默认为普通NAT模式。
     */
    public String bindType;

    /**
     * 限速模式。
     * `STRICT`严格模式必须同时指定`bandwidth`。
     */
    public String rateLimitMode;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrefixLength() {
        return this.prefixLength;
    }

    public void setPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
    }

    @Deprecated
    public String getEipV4Type() {
        return this.eipV4Type;
    }

    @Deprecated
    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    @Deprecated
    public String getPrimaryIsp() {
        return this.primaryIsp;
    }

    @Deprecated
    public void setPrimaryIsp(String primaryIsp) {
        this.primaryIsp = primaryIsp;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getCidrId() {
        return this.cidrId;
    }

    public void setCidrId(String cidrId) {
        this.cidrId = cidrId;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getPeerRegionId() {
        return this.peerRegionId;
    }

    public void setPeerRegionId(String peerRegionId) {
        this.peerRegionId = peerRegionId;
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

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getBindType() {
        return this.bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}