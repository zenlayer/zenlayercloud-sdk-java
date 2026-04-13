package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateSubnetRequest extends TeaModel {


    /**
     * 可用区的节点ID。
     */
    public String zoneId;

    /**
     * 子网的CIDR。
     * 可选值10.0.0.0/16、172.16.0.0/16和192.168.0.0/16及它们包含的子网。
     * 如果指定了VPC ID，那么子网网段必须在VPC的CIDR范围之内，且不能和VPC下其他子网网段有重叠。
     */
    public String cidrBlock;

    /**
     * 子网的名称。
     * 范围1到64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String subnetName;

    /**
     * 子网所在的资源组ID。
     * 如果不指定，则会放入默认资源组， 如果用户没有默认资源组权限， 则请求将会失败。
     * 如果指定VPC，则会忽略该参数自动使用与VPC相同的资源组。
     */
    public String resourceGroupId;

    /**
     * VPC的ID。
     */
    public String vpcId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}