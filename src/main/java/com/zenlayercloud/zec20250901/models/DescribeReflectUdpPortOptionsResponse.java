package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 默认UDP反射源端口列表
 */
public class DescribeReflectUdpPortOptionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 默认UDP反射源端口列表
     */
    public List<ReflectUdpPortPolicy> reflectUdpPorts;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ReflectUdpPortPolicy> getReflectUdpPorts() {
        return this.reflectUdpPorts;
    }

    public void setReflectUdpPorts(List<ReflectUdpPortPolicy> reflectUdpPorts) {
        this.reflectUdpPorts = reflectUdpPorts;
    }

}