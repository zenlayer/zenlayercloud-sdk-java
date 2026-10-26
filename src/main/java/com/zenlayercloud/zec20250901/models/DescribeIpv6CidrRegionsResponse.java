package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIpv6CidrRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 支持售卖IPv6 CIDR的节点列表。
     */
    public List<Ipv6CidrRegionItem> regionSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Ipv6CidrRegionItem> getRegionSet() {
        return this.regionSet;
    }

    public void setRegionSet(List<Ipv6CidrRegionItem> regionSet) {
        this.regionSet = regionSet;
    }

}