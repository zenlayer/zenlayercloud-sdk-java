package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateVpcRequest extends TeaModel {


    /**
     * VPC的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String name;

    /**
     * VPC的CIDR地址段，该VPC下所有子网必须落在此网段内。
     * 掩码范围为9到29，且必须填写网段的起始地址，例如 `10.0.0.0/16`。
     * 支持配置多个网段，多个网段之间以英文逗号分隔，例如：`21.0.0.0/9,22.0.0.0/9`，各网段之间不能重叠。
     * 单个VPC的网段数量上限由配额 `ZEC_CIDR_IPv4_Blocks_per_VPC` 控制，默认为5个，可申请提升。
     * 不能与以下保留网段重叠：`0.0.0.0/8`、`100.64.0.0/10`、`127.0.0.0/8`、`169.254.0.0/16`、`224.0.0.0/4`。
     */
    public String cidrBlock;

    /**
     * VPC的MTU（最大传输单元）。支持：1300、1500、9000。
     */
    public Integer mtu;

    /**
     * 是否开启内网IPv6。
     * 一旦开启，后续无法关闭。
     * 默认为关闭。
     */
    public Boolean enablePriIpv6;

    /**
     * VPC所在的资源组ID。
     * 如果不指定资源组，则会放到默认的资源组中。
     */
    public String resourceGroupId;

    /**
     * 创建VPC时关联的标签。同一资源中标签键不能重复。
     */
    public TagAssociation tags;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Boolean getEnablePriIpv6() {
        return this.enablePriIpv6;
    }

    public void setEnablePriIpv6(Boolean enablePriIpv6) {
        this.enablePriIpv6 = enablePriIpv6;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}