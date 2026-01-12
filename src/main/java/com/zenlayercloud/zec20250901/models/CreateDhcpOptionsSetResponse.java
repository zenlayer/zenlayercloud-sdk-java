package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateDhcpOptionsSetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * DHCP 选项集ID
     */
    public String dhcpOptionsSetId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

}