package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIpv6CidrNetmasksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 该节点当前可售的掩码档位列表，按掩码升序排列。
     * 库存为0或未配置售卖价格的掩码不会返回。
     */
    public List<Ipv6CidrNetmaskInfo> netmaskSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Ipv6CidrNetmaskInfo> getNetmaskSet() {
        return this.netmaskSet;
    }

    public void setNetmaskSet(List<Ipv6CidrNetmaskInfo> netmaskSet) {
        this.netmaskSet = netmaskSet;
    }

}