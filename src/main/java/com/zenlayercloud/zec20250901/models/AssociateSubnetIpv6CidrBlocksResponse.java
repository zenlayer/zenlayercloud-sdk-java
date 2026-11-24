package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AssociateSubnetIpv6CidrBlocksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 本次添加的IPv6网段列表。
     */
    public List<SubnetIpv6CidrBlockInfo> ipv6CidrBlocks;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<SubnetIpv6CidrBlockInfo> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public void setIpv6CidrBlocks(List<SubnetIpv6CidrBlockInfo> ipv6CidrBlocks) {
        this.ipv6CidrBlocks = ipv6CidrBlocks;
    }

}