package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyIpv6BandwidthRequest extends TeaModel {


    /**
     * IPv6唯一标识ID。
     */
    public String ipv6Id;

    /**
     * 调整带宽限速的目标值。
     * 单位Mbps。
     */
    public Integer bandwidth;

    public String getIpv6Id() {
        return this.ipv6Id;
    }

    public void setIpv6Id(String ipv6Id) {
        this.ipv6Id = ipv6Id;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

}