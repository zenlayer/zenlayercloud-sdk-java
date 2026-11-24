package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassignNetworkInterfaceIpv6Request extends TeaModel {


    /**
     * 要删除IPv6的网卡ID。
     * 可通过调用 **DescribeNetworkInterfaces** 获取。
     */
    public String nicId;

    /**
     * 要删除的网卡IPv6 CIDR。
     * 不指定时删除网卡全部IPv6（堆栈类型为`IPv4_IPv6`的网卡随之降级为`IPv4`）；堆栈类型为`IPv6`的网卡必须指定，且不支持删除最后一个IPv6。
     * 可通过调用 **DescribeNetworkInterfaces** 的`ipv6CidrBlocks`获取。
     */
    public String ipv6CidrBlock;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

}