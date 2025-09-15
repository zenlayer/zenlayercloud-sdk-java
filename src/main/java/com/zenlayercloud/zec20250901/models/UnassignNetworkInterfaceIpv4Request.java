package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class UnassignNetworkInterfaceIpv4Request extends TeaModel {


    /**
     * 网卡ID
     */
    public String nicId;

    /**
     * 需要解绑的IPv4地址。
     * 该字段已过时，请使用`ipAddresses`，如果两者均指定， 则以`ipAddresses`为准
     */
    public String ipAddress;

    /**
     * 需要解绑的内网IPv4地址
     */
    public List<String> ipAddresses;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

}