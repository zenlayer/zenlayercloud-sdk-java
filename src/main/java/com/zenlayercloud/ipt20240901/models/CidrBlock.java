package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用 CIDR 块信息。
 */
public class CidrBlock extends TeaModel {


    /**
     * 掩码长度。
     * IPv4 范围 24–32，IPv6 范围 48–64。
     */
    public Integer netmask;

    /**
     * IP 网络类型。
     */
    public String ipNetworkType;

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

}