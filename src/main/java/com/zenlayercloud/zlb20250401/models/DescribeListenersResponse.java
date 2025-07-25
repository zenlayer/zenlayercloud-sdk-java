package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeListenersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 监听器列表
     */
    public List<Listener> listeners;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Listener> getListeners() {
        return this.listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

}