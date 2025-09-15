package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class BatchAssignNetworkInterfaceIpv4Response extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 绑定的内网IP地址
     */
    public List<String> ipAddresses;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

}