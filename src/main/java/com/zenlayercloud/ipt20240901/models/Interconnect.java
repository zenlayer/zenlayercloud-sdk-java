package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述IP Transit 互联IP地址的信息。
 */
public class Interconnect extends TeaModel {


    /**
     * 运营商侧的IPv4地址。
     */
    public String vendorIpv4Address;

    /**
     * 用户侧的IPv4地址。
     */
    public String customerIpv4Address;

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

}