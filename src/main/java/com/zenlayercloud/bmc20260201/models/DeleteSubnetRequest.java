package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DeleteSubnetRequest extends TeaModel {


    /**
     * 子网的ID。
     */
    public String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}