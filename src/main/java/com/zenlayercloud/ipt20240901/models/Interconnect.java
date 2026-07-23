package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 互联地址配置。
 */
public class Interconnect extends TeaModel {


    /**
     * Zenlayer 侧 IPv4 互联地址。
     */
    public String vendorIpv4Address;

    /**
     * 客户侧 IPv4 互联地址。
     */
    public String customerIpv4Address;

    /**
     * Zenlayer 侧 IPv6 互联地址。
     */
    public String vendorIpv6Address;

    /**
     * 客户侧 IPv6 互联地址。
     */
    public String customerIpv6Address;

    public String getVendorIpv4Address() {
        return this.vendorIpv4Address;
    }

    public void setVendorIpv4Address(String vendorIpv4Address) {
        this.vendorIpv4Address = vendorIpv4Address;
    }

    public String getCustomerIpv4Address() {
        return this.customerIpv4Address;
    }

    public void setCustomerIpv4Address(String customerIpv4Address) {
        this.customerIpv4Address = customerIpv4Address;
    }

    public String getVendorIpv6Address() {
        return this.vendorIpv6Address;
    }

    public void setVendorIpv6Address(String vendorIpv6Address) {
        this.vendorIpv6Address = vendorIpv6Address;
    }

    public String getCustomerIpv6Address() {
        return this.customerIpv6Address;
    }

    public void setCustomerIpv6Address(String customerIpv6Address) {
        this.customerIpv6Address = customerIpv6Address;
    }

}