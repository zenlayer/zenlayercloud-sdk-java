package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DeleteDhcpOptionsSetRequest extends TeaModel {


    /**
     * DHCP 选项集ID
     */
    public String dhcpOptionsSetId;

    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

}