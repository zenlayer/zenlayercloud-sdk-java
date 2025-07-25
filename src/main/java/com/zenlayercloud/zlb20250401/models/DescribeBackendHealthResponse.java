package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBackendHealthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 负载均衡的后端服务器状态
     */
    public List<ListenerBackendHealth> backends;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ListenerBackendHealth> getBackends() {
        return this.backends;
    }

    public void setBackends(List<ListenerBackendHealth> backends) {
        this.backends = backends;
    }

}