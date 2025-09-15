package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建子网请求参数。
 */
public class CreateSubnetRequest extends TeaModel {


    /**
     * 需要添加子网的VPC ID
     */
    public String vpcId;

    /**
     * 子网名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    /**
     * 子网所在的节点ID
     */
    public String regionId;

    /**
     * 子网的IP堆栈类型
     */
    public String stackType;

    /**
     * 子网的IPv4 CIDR地址段。
     * 如果指定堆栈类型`stackType` 包含 `IPv4`, 则该字段必填。
     * 指定的CIDR地址段必须属于VPC的CIDR范围内
     */
    public String cidrBlock;

    /**
     * IPv6的类型。
     * 如果指定堆栈类型`stackType` 包含 `IPv6`, 则该字段必填
     */
    public String ipv6Type;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStackType() {
        return this.stackType;
    }

    public void setStackType(String stackType) {
        this.stackType = stackType;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getIpv6Type() {
        return this.ipv6Type;
    }

    public void setIpv6Type(String ipv6Type) {
        this.ipv6Type = ipv6Type;
    }

}