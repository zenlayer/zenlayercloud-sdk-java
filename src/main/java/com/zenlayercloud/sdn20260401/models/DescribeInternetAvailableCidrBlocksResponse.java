package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInternetAvailableCidrBlocksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用 IPv4 CIDR 块列表。
     */
    public List<InternetCidrBlock> ipv4CidrBlocks;

    /**
     * 可用 IPv6 CIDR 块列表。
     */
    public List<InternetCidrBlock> ipv6CidrBlocks;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InternetCidrBlock> getIpv4CidrBlocks() {
        return this.ipv4CidrBlocks;
    }

    public void setIpv4CidrBlocks(List<InternetCidrBlock> ipv4CidrBlocks) {
        this.ipv4CidrBlocks = ipv4CidrBlocks;
    }

    public List<InternetCidrBlock> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public void setIpv6CidrBlocks(List<InternetCidrBlock> ipv6CidrBlocks) {
        this.ipv6CidrBlocks = ipv6CidrBlocks;
    }

}