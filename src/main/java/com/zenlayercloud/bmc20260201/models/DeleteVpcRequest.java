package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DeleteVpcRequest extends TeaModel {


    /**
     * VPC的ID。
     */
    public String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}