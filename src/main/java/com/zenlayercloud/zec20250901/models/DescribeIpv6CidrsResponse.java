package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询CIDR IPV6地址的响应信息。
 */
public class DescribeIpv6CidrsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 查询IPV6 CIDR地址的结果数据
     */
    public List<Ipv6CidrInfo> dataSet;

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

    public List<Ipv6CidrInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<Ipv6CidrInfo> dataSet) {
        this.dataSet = dataSet;
    }

}