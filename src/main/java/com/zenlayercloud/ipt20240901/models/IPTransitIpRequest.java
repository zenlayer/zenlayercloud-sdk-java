package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网 IP 分配请求。
 */
public class IPTransitIpRequest extends TeaModel {


    /**
     * CIDR 掩码长度。
     * IPv4 有效范围 24–30，IPv6 有效范围 48–64。
     */
    public Integer netmask;

    /**
     * IP 类型（IPV4 / IPV6）。
     */
    public String ipType;

    /**
     * IP 类型。
     * 默认 BGP_IP（从 IP 池分配）。
     * LOCAL_IP 表示原生 IP。
     */
    public String ipNetworkType;

    /**
     * 购买数量。
     * 指定相同掩码长度的 IP 块数量，默认为 1。
     */
    public Integer amount;

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getIpNetworkType() {
        return this.ipNetworkType;
    }

    public void setIpNetworkType(String ipNetworkType) {
        this.ipNetworkType = ipNetworkType;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}