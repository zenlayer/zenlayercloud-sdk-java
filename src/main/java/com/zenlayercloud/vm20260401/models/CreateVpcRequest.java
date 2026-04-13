package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateVpcRequest extends TeaModel {


    /**
     * 子网的节点ID。
     */
    public String zoneId;

    /**
     * VPC的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String vpcName;

    /**
     * VPC的CIDR。
     * 可选值10.0.0.0/16、172.16.0.0/16和192.168.0.0/16及它们包含的子网。
     */
    public String vpcCidrBlock;

    /**
     * VPC描述信息。
     */
    public String vpcDescription;

    /**
     * 子网的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String subnetName;

    /**
     * 子网的CIDR。
     * 必须包含在VPC的网段内。
     */
    public String subnetCidrBlock;

    /**
     * 子网描述信息。
     */
    public String subnetDescription;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getVpcCidrBlock() {
        return this.vpcCidrBlock;
    }

    public void setVpcCidrBlock(String vpcCidrBlock) {
        this.vpcCidrBlock = vpcCidrBlock;
    }

    public String getVpcDescription() {
        return this.vpcDescription;
    }

    public void setVpcDescription(String vpcDescription) {
        this.vpcDescription = vpcDescription;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getSubnetCidrBlock() {
        return this.subnetCidrBlock;
    }

    public void setSubnetCidrBlock(String subnetCidrBlock) {
        this.subnetCidrBlock = subnetCidrBlock;
    }

    public String getSubnetDescription() {
        return this.subnetDescription;
    }

    public void setSubnetDescription(String subnetDescription) {
        this.subnetDescription = subnetDescription;
    }

}