package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIPTransitAvailableCidrBlocksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用 IPv4 CIDR 块列表。
     */
    public List<CidrBlock> ipv4CidrBlocks;

    /**
     * 可用 IPv6 CIDR 块列表。
     */
    public List<CidrBlock> ipv6CidrBlocks;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<CidrBlock> getIpv4CidrBlocks() {
        return this.ipv4CidrBlocks;
    }

    public void setIpv4CidrBlocks(List<CidrBlock> ipv4CidrBlocks) {
        this.ipv4CidrBlocks = ipv4CidrBlocks;
    }

    public List<CidrBlock> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public void setIpv6CidrBlocks(List<CidrBlock> ipv6CidrBlocks) {
        this.ipv6CidrBlocks = ipv6CidrBlocks;
    }

}