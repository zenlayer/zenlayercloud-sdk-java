package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DeleteVpcSubnetRequest extends TeaModel {


    /**
     * VPC子网的ID。
     */
    public String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}