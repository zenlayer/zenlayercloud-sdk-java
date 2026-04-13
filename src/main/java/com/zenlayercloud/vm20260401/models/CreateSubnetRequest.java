package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateSubnetRequest extends TeaModel {


    /**
     * 子网的CIDR。
     * 可选值10.0.0.0/16、172.16.0.0/16和192.168.0.0/16及它们包含的子网。
     * 子网网段不能重叠。
     */
    public String cidrBlock;

    /**
     * 子网的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String subnetName;

    /**
     * 子网的描述信息。
     */
    public String subnetDescription;

    /**
     * 子网的节点ID。
     */
    public String zoneId;

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

    public String getSubnetDescription() {
        return this.subnetDescription;
    }

    public void setSubnetDescription(String subnetDescription) {
        this.subnetDescription = subnetDescription;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}