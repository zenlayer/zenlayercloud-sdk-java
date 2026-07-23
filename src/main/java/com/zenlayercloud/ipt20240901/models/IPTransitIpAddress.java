package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * IP Transit公网 IP 地址信息。
 */
public class IPTransitIpAddress extends TeaModel {


    /**
     * IP 块 UUID。
     * 变更（升降级/删除）时作为 ipUuid 传入。
     */
    public String ipUuid;

    /**
     * IP 地址（CIDR 表示法，如 192.0.2.0/30）。
     */
    public String ipAddress;

    /**
     * 掩码长度。
     */
    public Integer netmask;

    /**
     * 网关 IP。
     */
    public String gatewayIpAddress;

    /**
     * IP 类型（IPV4 / IPV6）。
     */
    public String ipType;

    /**
     * IP 网络类型（BGP_IP / LOCAL_IP）。
     */
    public String ipNetworkType;

    public String getIpUuid() {
        return this.ipUuid;
    }

    public void setIpUuid(String ipUuid) {
        this.ipUuid = ipUuid;
    }

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

}