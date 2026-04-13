package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AssociateSubnetInstancesRequest extends TeaModel {


    /**
     * Subnet ID。
     */
    public String subnetId;

    /**
     * Subnet绑定实例集合。
     */
    public List<AssociateSubnetInstance> subnetInstanceList;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public List<AssociateSubnetInstance> getSubnetInstanceList() {
        return this.subnetInstanceList;
    }

    public void setSubnetInstanceList(List<AssociateSubnetInstance> subnetInstanceList) {
        this.subnetInstanceList = subnetInstanceList;
    }

}