package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述IP信息。
 */
public class IPAddress extends TeaModel {


    /**
     * IP地址。
     */
    public String ipAddress;

    /**
     * 掩码。
     */
    public Integer netmask;

    /**
     * 网关IP地址。
     */
    public String gatewayIpAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getGatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    public void setGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
    }

}