package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述SNAT规则的信息。
 */
public class SnatEntry extends TeaModel {


    /**
     * SNAT规则 ID
     */
    public String snatEntryId;

    /**
     * CIDR网段，不传默认是0.0.0.0/0。
     * `cidrs` 和 `snatSubnets` 不会同时存在
     */
    public List<String> cidrs;

    /**
     * SNAT规则添加的eip ID集合
     */
    public List<String> eipIds;

    /**
     * SNAT规则添加的subnet ID集合
     */
    public List<SnatSubnetRef> snatSubnets;

    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public void setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
    }

    public List<String> getCidrs() {
        return this.cidrs;
    }

    public void setCidrs(List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public List<SnatSubnetRef> getSnatSubnets() {
        return this.snatSubnets;
    }

    public void setSnatSubnets(List<SnatSubnetRef> snatSubnets) {
        this.snatSubnets = snatSubnets;
    }

}