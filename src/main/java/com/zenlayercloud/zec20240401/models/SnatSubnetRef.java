package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class SnatSubnetRef extends TeaModel {


    /**
     * subnetId
     */
    public String subnetId;

    /**
     * cidr
     */
    public String cidr;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getCidr() {
        return this.cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

}