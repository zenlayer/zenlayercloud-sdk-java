package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * Snat规则添加的子网集合。
 */
public class SnatSubnet extends TeaModel {


    /**
     * 子网的ID
     */
    public String subnetId;

    /**
     * 子网的CIDR
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