package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeAvailableIpv4ResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用资源的集合。
     */
    public List<AvailableIpv4Resource> availableIpv4Resources;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AvailableIpv4Resource> getAvailableIpv4Resources() {
        return this.availableIpv4Resources;
    }

    public void setAvailableIpv4Resources(List<AvailableIpv4Resource> availableIpv4Resources) {
        this.availableIpv4Resources = availableIpv4Resources;
    }

}