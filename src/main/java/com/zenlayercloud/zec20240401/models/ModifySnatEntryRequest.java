package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifySnatEntryRequest extends TeaModel {


    /**
     * SNAT规则 ID
     */
    public String snatEntryId;

    /**
     * CIDR网段，不传默认是0.0.0.0/0
     */
    public String cidr;

    /**
     * SNAT规则添加的eip ID集合。
     * 为空代表加入网关的所有eip
     */
    public List<String> eipIds;


    /**
     * by Subnet的情况，subnet的id集合
     */
    public List<String> subnetIds;

    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public void setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}