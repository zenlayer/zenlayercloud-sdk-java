package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AttachDhcpOptionsSetToSubnetRequest extends TeaModel {


    /**
     * DHCP 选项集ID。
     */
    public String dhcpOptionsSetId;

    /**
     * 要与 DHCP 选项集关联的 Subnet 的 ID集合。
     */
    public List<String> subnetIds;

    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}