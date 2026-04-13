package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeAvailableIpv6ResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用资源的集合。
     */
    public List<AvailableIpv6Resource> availableIpv6Resources;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AvailableIpv6Resource> getAvailableIpv6Resources() {
        return this.availableIpv6Resources;
    }

    public void setAvailableIpv6Resources(List<AvailableIpv6Resource> availableIpv6Resources) {
        this.availableIpv6Resources = availableIpv6Resources;
    }

}