package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateSnatEntryRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * SNAT规则添加的弹性公网IP集合。
     * 指定的公网IP ID必须属于NAT网关上绑定的公网弹性IP。
     * 为空则代表与该NAT网关绑定的所有的弹性公网IP
     */
    public List<String> eipIds;

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
     * 指定子网ID集合。
     * 该参数表示该子网内的实例均可以通过`SNAT`规则访问外部网络。
     * 与`sourceCidrBlocks`必须指定其中的一种
     */
    public List<String> subnetIds;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
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