package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeIpv6AddressesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的公网 IPv6 总数。
     */
    public Integer totalCount;

    /**
     * 返回的公网 IPv6 列表。
     */
    public List<Ipv6AddressInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Ipv6AddressInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<Ipv6AddressInfo> dataSet) {
        this.dataSet = dataSet;
    }

}