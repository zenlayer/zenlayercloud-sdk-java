package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyVpcAttributeRequest extends TeaModel {


    /**
     * VPC的ID。
     */
    public String vpcId;

    /**
     * VPC的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String vpcName;

    /**
     * 需要修改的IPv4 CIDR。
     * 掩码范围为9到29。
     * 支持配置多个网段，多个网段之间以英文逗号分隔，例如：`21.0.0.0/9,22.0.0.0/9`，各网段之间不能重叠，最多支持5个网段。
     * **强烈建议使用 RFC 1918 定义的私有地址空间内的网段**：`10.0.0.0/8`、`172.16.0.0/12` 或 `192.168.0.0/16`。
     * 请注意 `10.0.0.0/8` 本身超出了VPC支持的最大网段规模，如需使用 10.x 地址空间，请指定其子网段，例如 `10.0.0.0/16`。
     * 非 RFC 1918 网段可以被接受，但存在显著风险：所有发往这些地址的流量都会在VPC内被路由、不会离开VPC，该VPC下的实例将失去访问该网段上真实互联网服务的能力，且故障隐蔽（路由表正常但目标不可达）。
     * 与以下保留网段重叠的网段不可使用，将被拒绝：`0.0.0.0/8`、`100.64.0.0/10`、`127.0.0.0/8`、`169.254.0.0/16`、`224.0.0.0/4`。
     * 如果VPC存在子网，则修改后的CIDR范围必须覆盖原VPC CIDR的每一个网段。
     * 默认VPC不支持修改。
     */
    public String cidrBlock;

    /**
     * 是否开启IPv6内网CIDR。
     * 当前仅允许打开(`true`)，一旦设置IPv6, 将无法关闭。
     */
    public Boolean enableIPv6;

    /**
     * 修改VPC绑定的安全组ID。
     * 如果不指定，则不会修改。
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