package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建全球VPC的请求参数。
 */
public class CreateVpcRequest extends TeaModel {


    /**
     * VPC的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    /**
     * VPC的CIDR地址段。
     * 需要满足以下4种内网段内(10.0.0.0/9, 10.128.0.0/9, 172.16.0.0/12以及192.168.0.0/16)
     */
    public String cidrBlock;

    /**
     * VPC的传输单元 MTU。
     * 支持：1300、1500、9000
     */
    public Integer mtu;

    /**
     * 是否开启内网IPv6。
     * 一旦开启，后续无法关闭。
     * 默认为关闭
     */
    public Boolean enablePriIpv6;

    /**
     * VPC所在的资源组ID。
     * 如果不指定资源组，则会放到默认的资源组中
     */
    public String resourceGroupId;

    /**
     * 创建VPC时关联的标签。
     * 注意：·关联`标签键`不能重复
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