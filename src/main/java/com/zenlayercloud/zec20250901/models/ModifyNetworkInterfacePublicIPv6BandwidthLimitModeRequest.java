package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ModifyNetworkInterfacePublicIPv6BandwidthLimitModeRequest extends TeaModel {


    /**
     * IPv6 CIDR的ID。
     */
    public String ipv6CidrId;

    /**
     * 新的限速模式。
     */
    public String rateLimitMode;

    public String getIpv6CidrId() {
        return this.ipv6CidrId;
    }

    public void setIpv6CidrId(String ipv6CidrId) {
        this.ipv6CidrId = ipv6CidrId;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}