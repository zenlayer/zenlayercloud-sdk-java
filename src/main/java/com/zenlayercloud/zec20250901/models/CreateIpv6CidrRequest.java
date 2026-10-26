package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateIpv6CidrRequest extends TeaModel {


    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 公网IPv6的网络类型。
     * 支持的线路以`DescribeIpv6CidrNetmasks`的返回为准。
     */
    public String networkLineType;

    /**
     * 要购买的CIDR掩码与数量。
     * 需要购买不同掩码的CIDR时请分多次调用。
     */
    public Ipv6NetmaskInfo netmask;

    /**
     * 该CIDR拆分成子网时使用的掩码长度。
     * 取值范围为`[掩码, 掩码+8]`。
     */
    public Integer subnetMaskLength;

    /**
     * CIDR名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     * 默认会将分配的CIDR地址作为名称。
     */
    public String name;

    /**
     * 资源组ID。
     * 如果不指定，则会加入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 后付费的承诺期设置。
     * 仅支持账号已开通的承诺期时长。
     */
    public ChargePostpaid instanceChargePostpaid;

    /**
     * 市场营销相关的选项。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建CIDR时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

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

    public Integer getSubnetMaskLength() {
        return this.subnetMaskLength;
    }

    public void setSubnetMaskLength(Integer subnetMaskLength) {
        this.subnetMaskLength = subnetMaskLength;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
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

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}