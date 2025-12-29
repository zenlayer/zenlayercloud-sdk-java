package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改VPC的属性请求参数。
 */
public class ModifyVpcAttributeRequest extends TeaModel {


    /**
     * VPC的ID
     */
    public String vpcId;

    /**
     * VPC的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String vpcName;

    /**
     * 需要修改的IPv4 CIDR。
     * 需要满足以下4种内网段内(10.0.0.0/9, 10.128.0.0/9, 172.16.0.0/12以及192.168.0.0/16)。
     * 如果VPC存在子网，则修改的CIDR范围必须包含原VPC CIDR。
     * 默认VPC不支持修改
     */
    public String cidrBlock;

    /**
     * 是否开启IPv6内网CIDR。
     * 当前仅允许打开(`true`)，一旦设置IPv6, 将无法关闭
     */
    public Boolean enableIPv6;

    /**
     * 修改VPC绑定的安全组ID。
     * 如果不指定，则不会修改
     */
    public String securityGroupId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    public void setEnableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}