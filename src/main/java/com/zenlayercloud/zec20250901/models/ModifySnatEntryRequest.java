package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifySnatEntryRequest extends TeaModel {


    /**
     * SNAT规则 ID
     */
    public String snatEntryId;

    /**
     * SNAT规则添加的弹性公网IP ID集合。
     * 如果需要修改为NAT网关所有上弹性公网IP，请指定`isAllEip`=`true`
     */
    public List<String> eipIds;

    /**
     * 弹性公网IP是否为所有的NAT网关上的公网弹性IP
     */
    public Boolean isAllEip;

    /**
     * 源CIDR网段。
     * 该字段已废弃，请使用`sourceCidrBlocks`
     */
    public String cidr;

    /**
     * 源CIDR地址段列表。
     * 与`subnetIds`必须指定其中的一种。
     * 如果使用全地址段，指定为`0.0.0.0/0`
     */
    public List<String> sourceCidrBlocks;

    /**
     * 要修改子网ID集合。
     * 该参数表示该子网内的实例均可以通过`SNAT`规则访问外部网络。
     * 与`sourceCidrBlocks`必须指定其中的一种
     */
    public List<String> subnetIds;

    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public void setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public Boolean getIsAllEip() {
        return this.isAllEip;
    }

    public void setIsAllEip(Boolean isAllEip) {
        this.isAllEip = isAllEip;
    }

    public String getCidr() {
        return this.cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public List<String> getSourceCidrBlocks() {
        return this.sourceCidrBlocks;
    }

    public void setSourceCidrBlocks(List<String> sourceCidrBlocks) {
        this.sourceCidrBlocks = sourceCidrBlocks;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}