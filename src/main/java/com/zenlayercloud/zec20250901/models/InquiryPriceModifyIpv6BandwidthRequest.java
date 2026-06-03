package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyIpv6BandwidthRequest extends TeaModel {


    /**
     * 要操作的公网IPv6。
     */
    public String ipv6Id;

    /**
     * 调整后的带宽上限。
     * 单位：Mbps。
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