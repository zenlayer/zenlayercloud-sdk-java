package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * VPC网络信息。
 */
public class VpcNetworkInfo extends TeaModel {


    /**
     * VPC的ID。
     */
    public String vpcId;

    /**
     * VPC的机房ID。
     */
    public String zoneId;

    /**
     * VPC的名称。
     */
    public String vpcName;

    /**
     * VPC的CIDR地址块。
     */
    public String cidrBlock;

    /**
     * VPC的创建时间。
     */
    public String createTime;

    /**
     * VPC是否默认。
     */
    public Boolean isDefault;

    /**
     * VPC的子网ID列表。
     */
    public List<String> subnetIdList;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

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

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<String> getSubnetIdList() {
        return this.subnetIdList;
    }

    public void setSubnetIdList(List<String> subnetIdList) {
        this.subnetIdList = subnetIdList;
    }

}