package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class AssociateVpcSubnetRequest extends TeaModel {


    /**
     * Subnet的ID。
     */
    public String subnetId;

    /**
     * VPC的ID。
     */
    public String vpcId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}