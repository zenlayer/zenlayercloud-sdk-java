package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DescribeNetworkInterfacePublicIPv6Response extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 公网IPv6信息。
     * 网卡如果没有公网IPv6,则取值为空
     */
    public PublicIpv6CidrAddress address;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PublicIpv6CidrAddress getAddress() {
        return this.address;
    }

    public void setAddress(PublicIpv6CidrAddress address) {
        this.address = address;
    }

}