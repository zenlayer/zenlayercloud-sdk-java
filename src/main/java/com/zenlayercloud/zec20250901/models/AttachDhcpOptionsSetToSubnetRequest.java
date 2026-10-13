package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AttachDhcpOptionsSetToSubnetRequest extends TeaModel {


    /**
     * DHCP选项集ID。
     * 可通过调用 ~~DescribeDhcpOptionsSets~~ 获取。
     */
    public String dhcpOptionsSetId;

    /**
     * 要与DHCP选项集关联的子网ID集合。
     * 可通过调用 ~~DescribeSubnets~~ 获取。
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