package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBackendsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 负载均衡的后端服务器列表
     */
    public List<ListenerBackend> backends;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ListenerBackend> getBackends() {
        return this.backends;
    }

    public void setBackends(List<ListenerBackend> backends) {
        this.backends = backends;
    }

}